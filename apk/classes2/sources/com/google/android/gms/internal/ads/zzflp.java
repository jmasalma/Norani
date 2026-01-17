package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collection;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzflp extends zzfll {
    private final zzfln zza;
    private final zzfmm zzb = new zzfmm();
    private zzfnz zzc;
    private zzfmy zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final String zzg;

    zzflp(zzflm zzflm, zzfln zzfln, String str) {
        this.zza = zzfln;
        this.zzg = str;
        zzk((View) null);
        if (zzfln.zzd() == zzflo.HTML || zzfln.zzd() == zzflo.JAVASCRIPT) {
            this.zzd = new zzfmz(str, zzfln.zza());
        } else {
            this.zzd = new zzfnc(str, zzfln.zzi(), (String) null);
        }
        this.zzd.zzo();
        zzfmi.zza().zzd(this);
        this.zzd.zzf(zzflm);
    }

    private final void zzk(View view) {
        this.zzc = new zzfnz(view);
    }

    public final void zzb(View view, zzfls zzfls, String str) {
        if (!this.zzf) {
            this.zzb.zzb(view, zzfls, "Ad overlay");
        }
    }

    public final void zzc() {
        if (!this.zzf) {
            this.zzc.clear();
            if (!this.zzf) {
                this.zzb.zzc();
            }
            this.zzf = true;
            this.zzd.zze();
            zzfmi.zza().zze(this);
            this.zzd.zzc();
            this.zzd = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzf && zzf() != view) {
            zzk(view);
            this.zzd.zzb();
            Collection<zzflp> zzc2 = zzfmi.zza().zzc();
            if (zzc2 != null && !zzc2.isEmpty()) {
                for (zzflp zzflp : zzc2) {
                    if (zzflp != this && zzflp.zzf() == view) {
                        zzflp.zzc.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zze && this.zzd != null) {
            this.zze = true;
            zzfmi.zza().zzf(this);
            this.zzd.zzl(zzfmq.zzb().zza());
            this.zzd.zzg(zzfmg.zza().zzb());
            this.zzd.zzi(this, this.zza);
        }
    }

    public final View zzf() {
        return (View) this.zzc.get();
    }

    public final zzfmy zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzg;
    }

    public final List zzi() {
        return this.zzb.zza();
    }

    public final boolean zzj() {
        return this.zze && !this.zzf;
    }
}
