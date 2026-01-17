package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzbyp {
    static zzbyp zzi;

    public static synchronized zzbyp zzb(Context context) {
        synchronized (zzbyp.class) {
            zzbyp zzbyp = zzi;
            if (zzbyp != null) {
                return zzbyp;
            }
            Context applicationContext = context.getApplicationContext();
            zzbde.zza(applicationContext);
            zzg zzi2 = zzv.zzp().zzi();
            zzi2.zzp(applicationContext);
            zzbyh zzbyh = new zzbyh((zzbyj) null);
            zzbyh.zzb(applicationContext);
            zzbyh.zzc(zzv.zzD());
            zzbyh.zza(zzi2);
            zzbyh.zzd(zzv.zzo());
            zzbyp zze = zzbyh.zze();
            zzi = zze;
            ((zzbyb) ((zzbyi) zze).zzc.zzb()).zza();
            zzbyt zzbyt = (zzbyt) ((zzbyi) zzi).zzh.zzb();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzaJ)).booleanValue()) {
                zzv.zzr();
                Map zzw = zzs.zzw((String) zzbd.zzc().zzb(zzbde.zzaK));
                for (String zzc : zzw.keySet()) {
                    zzbyt.zzc(zzc);
                }
                zzbyt.zzd(new zzbyr(zzbyt, zzw));
            }
            zzbyp zzbyp2 = zzi;
            return zzbyp2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract zzbyf zza();
}
