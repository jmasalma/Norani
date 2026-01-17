package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfmg implements zzfmj {
    private static final zzfmg zza = new zzfmg(new zzfmk());
    private Date zzb;
    private boolean zzc;
    private final zzfmk zzd;
    private boolean zze;

    private zzfmg(zzfmk zzfmk) {
        this.zzd = zzfmk;
    }

    public static zzfmg zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(boolean z) {
        if (!this.zze && z) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    for (zzflp zzg : zzfmi.zza().zzb()) {
                        zzg.zzg().zzg(zzb());
                    }
                }
            }
        }
        this.zze = z;
    }

    public final void zzd(Context context) {
        if (!this.zzc) {
            zzfmk zzfmk = this.zzd;
            zzfmk.zzd(context);
            zzfmk.zze(this);
            zzfmk.zzf();
            this.zze = zzfmk.zza;
            this.zzc = true;
        }
    }
}
