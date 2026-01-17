package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfc;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public abstract class BaseAdView extends ViewGroup {
    @NotOnlyInitialized
    protected final zzen zza;

    protected BaseAdView(Context context, int i) {
        super(context);
        this.zza = new zzen(this, i);
    }

    public void destroy() {
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zze.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlB)).booleanValue()) {
                zzb.zzb.execute(new zze(this));
                return;
            }
        }
        this.zza.zzm();
    }

    public AdListener getAdListener() {
        return this.zza.zzb();
    }

    public AdSize getAdSize() {
        return this.zza.zzc();
    }

    public String getAdUnitId() {
        return this.zza.zzk();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.zza.zzd();
    }

    public long getPlacementId() {
        return this.zza.zza();
    }

    public ResponseInfo getResponseInfo() {
        return this.zza.zze();
    }

    public boolean isCollapsible() {
        return this.zza.zzC();
    }

    public boolean isLoading() {
        return this.zza.zzD();
    }

    public void loadAd(AdRequest adRequest) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zzf.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlE)).booleanValue()) {
                zzb.zzb.execute(new zzg(this, adRequest));
                return;
            }
        }
        this.zza.zzn(adRequest.zza);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        AdSize adSize;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                zzo.zzh("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                i3 = adSize.getHeightInPixels(context);
                i4 = widthInPixels;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public void pause() {
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zzg.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlC)).booleanValue()) {
                zzb.zzb.execute(new zzf(this));
                return;
            }
        }
        this.zza.zzo();
    }

    public void resume() {
        zzbde.zza(getContext());
        if (((Boolean) zzbfc.zzh.zze()).booleanValue()) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlA)).booleanValue()) {
                zzb.zzb.execute(new zzd(this));
                return;
            }
        }
        this.zza.zzq();
    }

    public void setAdListener(AdListener adListener) {
        zzen zzen = this.zza;
        zzen.zzs(adListener);
        if (adListener == null) {
            zzen.zzr((zza) null);
            return;
        }
        if (adListener instanceof zza) {
            zzen.zzr((zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzen.zzw((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.zza.zzt(adSize);
    }

    public void setAdUnitId(String str) {
        this.zza.zzv(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.zza.zzy(onPaidEventListener);
    }

    public void setPlacementId(long j) {
        this.zza.zzz(j);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.zza = new zzen(this, attributeSet, false, i);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.zza = new zzen(this, attributeSet, false, i2);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, int i, int i2, boolean z) {
        super(context, attributeSet, i);
        this.zza = new zzen(this, attributeSet, z, i2);
    }

    protected BaseAdView(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        this.zza = new zzen(this, attributeSet, z);
    }
}
