package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zziw {
    final Context zza;
    zzdj zzb = zzdj.zza;
    zzfwh zzc;
    zzfwh zzd;
    zzfwh zze;
    zzfwh zzf;
    zzfwh zzg;
    zzfve zzh;
    Looper zzi = zzex.zzz();
    int zzj = -1000;
    zze zzk = zze.zza;
    int zzl = 1;
    boolean zzm = true;
    zzmi zzn = zzmi.zzb;
    zzmh zzo = zzmh.zza;
    long zzp = 500;
    long zzq = 2000;
    boolean zzr = true;
    boolean zzs;
    String zzt = "";
    zzig zzu = new zzig(0.97f, 1.03f, 1000, 1.0E-7f, zzex.zzs(20), zzex.zzs(500), 0.999f, (zzif) null);

    public zziw(Context context, zzcem zzcem) {
        Context context2 = context;
        zzip zzip = new zzip(zzcem);
        zziq zziq = new zziq(context2);
        zzir zzir = new zzir(context2);
        zzis zzis = new zzis();
        zzit zzit = new zzit(context2);
        zziu zziu = new zziu();
        context.getClass();
        Context context3 = context2;
        this.zza = context2;
        this.zzc = zzip;
        this.zzd = zziq;
        this.zze = zzir;
        this.zzf = zzis;
        this.zzg = zzit;
        this.zzh = zziu;
        if (Build.VERSION.SDK_INT >= 35) {
            int i = zzim.zza;
        }
    }

    static /* synthetic */ zzvg zza(Context context) {
        return new zzuu(context, new zzadq());
    }
}
