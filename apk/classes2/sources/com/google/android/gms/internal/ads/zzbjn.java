package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbjn implements zzbkf {
    zzbjn() {
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfg zzcfg = (zzcfg) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzftx zzl = zzfty.zzl();
        zzl.zzb((String) map.get("appId"));
        zzl.zzh(zzcfg.getWidth());
        zzl.zzg(zzcfg.zzF().getWindowToken());
        if (!map.containsKey("gravityX") || !map.containsKey("gravityY")) {
            zzl.zzd(81);
        } else {
            zzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        }
        if (map.containsKey("verticalMargin")) {
            zzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzl.zza((String) map.get("enifd"));
        }
        try {
            zzv.zzk().zzj(zzcfg, zzl.zzi());
        } catch (NullPointerException e) {
            zzv.zzp().zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
