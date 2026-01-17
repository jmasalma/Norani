package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdmq implements zzazd {
    public final /* synthetic */ zzcfg zza;

    public /* synthetic */ zzdmq(zzcfg zzcfg) {
        this.zza = zzcfg;
    }

    public final void zzdr(zzazc zzazc) {
        String str;
        HashMap hashMap = new HashMap();
        if (true != zzazc.zzj) {
            str = "0";
        } else {
            str = "1";
        }
        hashMap.put("isVisible", str);
        this.zza.zzd("onAdVisibilityChanged", hashMap);
    }
}
