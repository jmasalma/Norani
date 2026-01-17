package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzded;
import com.google.android.gms.internal.ads.zzdsj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z, zzdsj zzdsj) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            zza zza = adOverlayInfoParcel.zzb;
            if (zza != null) {
                zza.onAdClicked();
            }
            zzded zzded = adOverlayInfoParcel.zzu;
            if (zzded != null) {
                zzded.zzdf();
            }
            Activity zzi = adOverlayInfoParcel.zzd.zzi();
            zzc zzc = adOverlayInfoParcel.zza;
            Activity activity = (zzc == null || !zzc.zzj || zzi == null) ? context : zzi;
            zzv.zzi();
            zza.zzb(activity, zzc, adOverlayInfoParcel.zzi, zzc != null ? zzc.zzi : null, zzdsj, adOverlayInfoParcel.zzq);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!PlatformVersion.isAtLeastLollipop()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznx)).booleanValue()) {
            zzv.zzr();
            zzs.zzY(context, intent, zzdsj, adOverlayInfoParcel.zzq);
            return;
        }
        zzv.zzr();
        zzs.zzU(context, intent);
    }
}
