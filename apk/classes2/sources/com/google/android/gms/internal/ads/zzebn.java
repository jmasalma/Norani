package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzebn {
    private final zzbcc zza;
    private final Context zzb;
    private final zzeas zzc;
    private final VersionInfoParcel zzd;

    public zzebn(Context context, VersionInfoParcel versionInfoParcel, zzbcc zzbcc, zzeas zzeas) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbcc;
        this.zzc = zzeas;
    }

    public final void zzb(boolean z) {
        try {
            this.zzc.zza(new zzebk(this, z));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            int i = zze.zza;
            zzo.zzg("Error in offline signals database startup: ".concat(valueOf));
        }
    }

    public static /* synthetic */ Void zza(zzebn zzebn, boolean z, SQLiteDatabase sQLiteDatabase) {
        zzebn zzebn2 = zzebn;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        if (z) {
            zzebn2.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(zzbcj.zzaf.zza.zzx(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgzw e) {
                    int i2 = zze.zza;
                    zzo.zzg("Unable to deserialize proto from offline signals database:");
                    zzo.zzg(e.getMessage());
                }
            }
            query.close();
            Context context = zzebn2.zzb;
            zzbcj.zzaf.zzc zzi = zzbcj.zzaf.zzi();
            zzi.zzv(context.getPackageName());
            zzi.zzy(Build.MODEL);
            zzi.zzA(zzebh.zza(sQLiteDatabase2, 0));
            zzi.zzh(arrayList);
            zzi.zzE(zzebh.zza(sQLiteDatabase2, 1));
            zzi.zzx(zzebh.zza(sQLiteDatabase2, 3));
            zzi.zzF(zzv.zzD().currentTimeMillis());
            zzi.zzB(zzebh.zzb(sQLiteDatabase2, 2));
            zzbcj.zzaf zzaf = (zzbcj.zzaf) zzi.zzbr();
            int size = arrayList.size();
            long j = 0;
            for (int i3 = 0; i3 < size; i3++) {
                zzbcj.zzaf.zza zza2 = (zzbcj.zzaf.zza) arrayList.get(i3);
                if (zza2.zzk() == zzbcj.zzq.ENUM_TRUE && zza2.zze() > j) {
                    j = zza2.zze();
                }
            }
            if (j != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
                sQLiteDatabase2.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", (String[]) null);
            }
            zzbcc zzbcc = zzebn2.zza;
            zzbcc.zzb(new zzebl(zzaf));
            VersionInfoParcel versionInfoParcel = zzebn2.zzd;
            zzbcj.zzar.zza zzd2 = zzbcj.zzar.zzd();
            zzd2.zzg(versionInfoParcel.buddyApkVersion);
            zzd2.zzi(versionInfoParcel.clientJarVersion);
            if (true != versionInfoParcel.isClientJar) {
                i = 2;
            }
            zzd2.zzh(i);
            zzbcc.zzb(new zzebm((zzbcj.zzar) zzd2.zzbr()));
            zzbcc.zzc(10004);
            zzebh.zze(sQLiteDatabase);
        }
        return null;
    }
}
