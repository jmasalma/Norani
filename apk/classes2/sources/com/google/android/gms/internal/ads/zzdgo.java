package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdgo implements zzcxm, zzr, zzcws {
    zzedh zza;
    private final Context zzb;
    private final zzcfg zzc;
    private final zzfca zzd;
    private final VersionInfoParcel zze;
    private final zzedf zzf;

    public zzdgo(Context context, zzcfg zzcfg, zzfca zzfca, VersionInfoParcel versionInfoParcel, zzedf zzedf) {
        this.zzb = context;
        this.zzc = zzcfg;
        this.zzd = zzfca;
        this.zze = versionInfoParcel;
        this.zzf = zzedf;
    }

    private final boolean zzg() {
        return ((Boolean) zzbd.zzc().zzb(zzbde.zzfC)).booleanValue() && this.zzf.zzd();
    }

    public final void zzd() {
    }

    public final void zzdk() {
    }

    public final void zzds() {
    }

    public final void zzdt() {
        zzcfg zzcfg;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzfF)).booleanValue() && (zzcfg = this.zzc) != null) {
            if (this.zza == null && !zzg()) {
                return;
            }
            if (this.zza != null) {
                zzcfg.zzd("onSdkImpression", new ArrayMap());
            } else {
                this.zzf.zzb();
            }
        }
    }

    public final void zzdv() {
    }

    public final void zzdw(int i) {
        this.zza = null;
    }

    public final void zzt() {
        zzcfg zzcfg;
        if (zzg()) {
            this.zzf.zzb();
        } else if (this.zza != null && (zzcfg = this.zzc) != null) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzfF)).booleanValue()) {
                zzcfg.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }

    public final void zzu() {
        zzcfg zzcfg;
        zzedd zzedd;
        zzede zzede;
        zzede zzede2;
        zzfca zzfca = this.zzd;
        if (zzfca.zzT && (zzcfg = this.zzc) != null) {
            if (!zzv.zzC().zzl(this.zzb)) {
                return;
            }
            if (zzg()) {
                this.zzf.zzc();
                return;
            }
            VersionInfoParcel versionInfoParcel = this.zze;
            String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
            zzfcz zzfcz = zzfca.zzV;
            String zza2 = zzfcz.zza();
            if (zzfcz.zzc() == 1) {
                zzedd = zzedd.VIDEO;
                zzede = zzede.DEFINED_BY_JAVASCRIPT;
            } else {
                if (zzfca.zzY == 2) {
                    zzede2 = zzede.UNSPECIFIED;
                } else {
                    zzede2 = zzede.BEGIN_TO_RENDER;
                }
                zzede = zzede2;
                zzedd = zzedd.HTML_DISPLAY;
            }
            zzedh zza3 = zzv.zzC().zza(str, zzcfg.zzG(), "", "javascript", zza2, zzede, zzedd, zzfca.zzal);
            this.zza = zza3;
            if (zza3 != null) {
                zzfll zza4 = zza3.zza();
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzfB)).booleanValue()) {
                    zzv.zzC().zzj(zza4, zzcfg.zzG());
                    for (View zzg : zzcfg.zzV()) {
                        zzv.zzC().zzg(zza4, zzg);
                    }
                } else {
                    zzv.zzC().zzj(zza4, zzcfg.zzF());
                }
                zzcfg.zzat(this.zza);
                zzv.zzC().zzk(zza4);
                zzcfg.zzd("onSdkLoaded", new ArrayMap());
            }
        }
    }
}
