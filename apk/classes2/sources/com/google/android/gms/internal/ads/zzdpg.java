package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdpg implements zzcgw {
    public final /* synthetic */ Bundle zza;
    public final /* synthetic */ zzcak zzb;

    public /* synthetic */ zzdpg(Bundle bundle, zzcak zzcak) {
        this.zza = bundle;
        this.zzb = zzcak;
    }

    public final void zza(boolean z, int i, String str, String str2) {
        zzcak zzcak = this.zzb;
        if (z) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzct)).booleanValue()) {
                this.zza.putLong(zzdrr.RENDERING_WEBVIEW_LOAD_HTML_END.zza(), zzv.zzD().currentTimeMillis());
            }
            zzcak.zzc((Object) null);
            return;
        }
        zzcak.zzd(new Exception("Ad Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }
}
