package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfg;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcfg zzcfg) throws zzg {
        this.zzb = zzcfg.getLayoutParams();
        ViewParent parent = zzcfg.getParent();
        this.zzd = zzcfg.zzE();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcfg.zzF());
            viewGroup.removeView(zzcfg.zzF());
            zzcfg.zzaq(true);
            return;
        }
        throw new zzg("Could not get the parent of the WebView for an overlay.");
    }
}
