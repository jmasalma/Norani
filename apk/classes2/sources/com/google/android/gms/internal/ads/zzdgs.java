package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbcj;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdgs implements zzcvy, zzddi {
    private final zzbyk zza;
    private final Context zzb;
    private final zzbyo zzc;
    private final View zzd;
    private String zze;
    private final zzbcj.zza.C0000zza zzf;

    public zzdgs(zzbyk zzbyk, Context context, zzbyo zzbyo, View view, zzbcj.zza.C0000zza zza2) {
        this.zza = zzbyk;
        this.zzb = context;
        this.zzc = zzbyo;
        this.zzd = view;
        this.zzf = zza2;
    }

    public final void zza() {
        this.zza.zzb(false);
    }

    public final void zzb() {
    }

    public final void zzc() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzo(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @ParametersAreNonnullByDefault
    public final void zzdu(zzbwc zzbwc, String str, String str2) {
        zzbyo zzbyo = this.zzc;
        Context context = this.zzb;
        if (zzbyo.zzp(context)) {
            try {
                zzbyo.zzl(context, zzbyo.zzb(context), this.zza.zza(), zzbwc.zzc(), zzbwc.zzb());
            } catch (RemoteException e) {
                int i = zze.zza;
                zzo.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    public final void zzi() {
    }

    public final void zzj() {
        zzbcj.zza.C0000zza zza2 = this.zzf;
        if (zza2 != zzbcj.zza.C0000zza.APP_OPEN) {
            String zzd2 = this.zzc.zzd(this.zzb);
            this.zze = zzd2;
            this.zze = String.valueOf(zzd2).concat(zza2 == zzbcj.zza.C0000zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }
}
