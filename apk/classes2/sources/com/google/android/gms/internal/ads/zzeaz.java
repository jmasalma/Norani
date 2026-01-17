package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzeaz implements zzfge {
    public final /* synthetic */ zzeba zza;
    public final /* synthetic */ long zzb;

    public /* synthetic */ zzeaz(zzeba zzeba, long j) {
        this.zza = zzeba;
        this.zzb = j;
    }

    public final Object zza(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (this.zza.zzf()) {
            return null;
        }
        long j = this.zzb;
        zzbcj.zzaf.zza.C0002zza zzn = zzbcj.zzaf.zza.zzn();
        zzn.zzP(j);
        byte[] zzaV = ((zzbcj.zzaf.zza) zzn.zzbr()).zzaV();
        zzebh.zzf(sQLiteDatabase, false, false);
        zzebh.zzc(sQLiteDatabase, j, zzaV);
        return null;
    }
}
