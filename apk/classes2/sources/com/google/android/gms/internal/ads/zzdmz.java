package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.google.android.gms.ads.internal.client.zzed;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmz extends zzbmr implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbgb {
    private View zza;
    private zzed zzb;
    private zzdio zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdmz(zzdio zzdio, zzdit zzdit) {
        this.zza = zzdit.zzf();
        this.zzb = zzdit.zzj();
        this.zzc = zzdio;
        if (zzdit.zzs() != null) {
            zzdit.zzs().zzap(this);
        }
    }

    private final void zzg() {
        View view;
        zzdio zzdio = this.zzc;
        if (zzdio != null && (view = this.zza) != null) {
            zzdio.zzC(view, Collections.emptyMap(), Collections.emptyMap(), zzdio.zzZ(this.zza));
        }
    }

    private final void zzh() {
        View view = this.zza;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zza);
            }
        }
    }

    private static final void zzi(zzbmv zzbmv, int i) {
        try {
            zzbmv.zze(i);
        } catch (RemoteException e) {
            int i2 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void onGlobalLayout() {
        zzg();
    }

    public final void onScrollChanged() {
        zzg();
    }

    public final zzed zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (!this.zzd) {
            return this.zzb;
        }
        int i = zze.zza;
        zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final zzbgm zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = zze.zza;
            zzo.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdio zzdio = this.zzc;
        if (zzdio == null || zzdio.zzc() == null) {
            return null;
        }
        return zzdio.zzc().zza();
    }

    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdio zzdio = this.zzc;
        if (zzdio != null) {
            zzdio.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdmy(this));
    }

    public final void zzf(IObjectWrapper iObjectWrapper, zzbmv zzbmv) throws RemoteException {
        String str;
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            int i = zze.zza;
            zzo.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbmv, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            if (view == null) {
                str = "can not get video view.";
            } else {
                str = "can not get video controller.";
            }
            int i2 = zze.zza;
            zzo.zzg("Instream internal error: ".concat(str));
            zzi(zzbmv, 0);
        } else if (this.zze) {
            int i3 = zze.zza;
            zzo.zzg("Instream ad should not be used again.");
            zzi(zzbmv, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            zzv.zzz();
            zzcas.zza(this.zza, this);
            zzv.zzz();
            zzcas.zzb(this.zza, this);
            zzg();
            try {
                zzbmv.zzf();
            } catch (RemoteException e) {
                int i4 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
