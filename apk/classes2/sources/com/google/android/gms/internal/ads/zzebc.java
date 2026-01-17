package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzebc implements zzfge {
    public final /* synthetic */ zzebd zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ ArrayList zzc;
    public final /* synthetic */ zzbcj.zzab zzd;
    public final /* synthetic */ zzbcj.zzaf.zzd zze;

    public /* synthetic */ zzebc(zzebd zzebd, boolean z, ArrayList arrayList, zzbcj.zzab zzab, zzbcj.zzaf.zzd zzd2) {
        this.zza = zzebd;
        this.zzb = z;
        this.zzc = arrayList;
        this.zzd = zzab;
        this.zze = zzd2;
    }

    public final Object zza(Object obj) {
        zzebe zzebe = this.zza.zzb;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (zzebe.zzf()) {
            return null;
        }
        zzbcj.zzaf.zzd zzd2 = this.zze;
        zzbcj.zzab zzab = this.zzd;
        ArrayList arrayList = this.zzc;
        boolean z = this.zzb;
        byte[] zze2 = zzebe.zze(zzebe, z, arrayList, zzab, zzd2);
        zzebh.zzf(sQLiteDatabase, z, true);
        zzebh.zzc(sQLiteDatabase, zzebe.zzf.zzd(), zze2);
        return null;
    }
}
