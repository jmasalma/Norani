package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbqv extends zzbqe {
    private final NativeAdMapper zza;

    public zzbqv(NativeAdMapper nativeAdMapper) {
        this.zza = nativeAdMapper;
    }

    public final boolean zzA() {
        return this.zza.getOverrideClickHandling();
    }

    public final boolean zzB() {
        return this.zza.getOverrideImpressionRecording();
    }

    public final double zze() {
        NativeAdMapper nativeAdMapper = this.zza;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    public final float zzf() {
        return this.zza.getMediaContentAspectRatio();
    }

    public final float zzg() {
        return this.zza.getCurrentTime();
    }

    public final float zzh() {
        return this.zza.getDuration();
    }

    public final Bundle zzi() {
        return this.zza.getExtras();
    }

    public final zzed zzj() {
        return null;
    }

    public final zzbgi zzk() {
        return null;
    }

    public final zzbgp zzl() {
        NativeAd.Image icon = this.zza.getIcon();
        if (icon != null) {
            return new zzbgc(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza(), (Map) null);
        }
        return null;
    }

    public final IObjectWrapper zzm() {
        View adChoicesContent = this.zza.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return ObjectWrapper.wrap(adChoicesContent);
    }

    public final IObjectWrapper zzn() {
        View zza2 = this.zza.zza();
        if (zza2 == null) {
            return null;
        }
        return ObjectWrapper.wrap(zza2);
    }

    public final IObjectWrapper zzo() {
        return null;
    }

    public final String zzp() {
        return this.zza.getAdvertiser();
    }

    public final String zzq() {
        return this.zza.getBody();
    }

    public final String zzr() {
        return this.zza.getCallToAction();
    }

    public final String zzs() {
        return this.zza.getHeadline();
    }

    public final String zzt() {
        return this.zza.getPrice();
    }

    public final String zzu() {
        return this.zza.getStore();
    }

    public final List zzv() {
        List<NativeAd.Image> images = this.zza.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new zzbgc(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza(), (Map) null));
            }
        }
        return arrayList;
    }

    public final void zzw(IObjectWrapper iObjectWrapper) {
        this.zza.handleClick((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    public final void zzx() {
        this.zza.recordImpression();
    }

    public final void zzy(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        View view = (View) ObjectWrapper.unwrap(iObjectWrapper);
        this.zza.trackViews(view, (HashMap) ObjectWrapper.unwrap(iObjectWrapper2), (HashMap) ObjectWrapper.unwrap(iObjectWrapper3));
    }

    public final void zzz(IObjectWrapper iObjectWrapper) {
        this.zza.untrackView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
