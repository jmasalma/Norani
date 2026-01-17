package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.zzc;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazr;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbpm;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzen {
    final zzbc zza;
    private final zzbpm zzb;
    private final zzq zzc;
    private final AtomicBoolean zzd;
    /* access modifiers changed from: private */
    public final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbx zzj;
    private VideoOptions zzk;
    private String zzl;
    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;
    private final AtomicLong zzq;

    public zzen(ViewGroup viewGroup, int i) {
        this(viewGroup, (AttributeSet) null, false, zzq.zza, (zzbx) null, i);
    }

    private static zzr zzF(Context context, AdSize[] adSizeArr, int i) {
        AdSize[] adSizeArr2 = adSizeArr;
        for (AdSize equals : adSizeArr2) {
            if (equals.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, (zzr[]) null, false, false, false, true, false, false, false, false);
            }
        }
        zzr zzr = new zzr(context, adSizeArr2);
        zzr.zzj = zzG(i);
        return zzr;
    }

    private static boolean zzG(int i) {
        return i == 1;
    }

    public final boolean zzB(zzbx zzbx) {
        try {
            IObjectWrapper zzo2 = zzbx.zzo();
            if (zzo2 == null || ((View) ObjectWrapper.unwrap(zzo2)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(zzo2));
            this.zzj = zzbx;
            return true;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzC() {
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                return zzbx.zzaa();
            }
            return false;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzD() {
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                return zzbx.zzab();
            }
            return false;
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzE() {
        return this.zzh;
    }

    public final long zza() {
        AtomicLong atomicLong = this.zzq;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                atomicLong.set(zzbx.zzc());
                return atomicLong.get();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return 0;
    }

    public final AdListener zzb() {
        return this.zzg;
    }

    public final AdSize zzc() {
        zzr zzh2;
        try {
            zzbx zzbx = this.zzj;
            if (!(zzbx == null || (zzh2 = zzbx.zzh()) == null)) {
                return zzc.zzc(zzh2.zze, zzh2.zzb, zzh2.zza);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzd() {
        return this.zzp;
    }

    public final ResponseInfo zze() {
        zzea zzea = null;
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzea = zzbx.zzl();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzea);
    }

    public final VideoController zzg() {
        return this.zze;
    }

    public final VideoOptions zzh() {
        return this.zzk;
    }

    public final AppEventListener zzi() {
        return this.zzi;
    }

    public final zzed zzj() {
        zzbx zzbx = this.zzj;
        if (zzbx != null) {
            try {
                return zzbx.zzm();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzk() {
        zzbx zzbx;
        if (this.zzl == null && (zzbx = this.zzj) != null) {
            try {
                this.zzl = zzbx.zzs();
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final void zzm() {
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzy();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzn(zzek zzek) {
        zzbx zzbx;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                ViewGroup viewGroup = this.zzm;
                Context context = viewGroup.getContext();
                zzr zzF = zzF(context, this.zzh, this.zzn);
                if ("search_v2".equals(zzF.zza)) {
                    zzbx = (zzbx) new zzan(zzbb.zza(), context, zzF, this.zzl).zzd(context, false);
                } else {
                    zzbx = (zzbx) new zzal(zzbb.zza(), context, zzF, this.zzl, this.zzb).zzd(context, false);
                }
                this.zzj = zzbx;
                zzbx.zzE(new zzg(this.zza));
                zza zza2 = this.zzf;
                if (zza2 != null) {
                    this.zzj.zzD(new zzb(zza2));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzH(new zzazr(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzW(new zzgc(this.zzk));
                }
                this.zzj.zzQ(new zzfu(this.zzp));
                this.zzj.zzO(this.zzo);
                zzbx zzbx2 = this.zzj;
                if (zzbx2 != null) {
                    try {
                        IObjectWrapper zzo2 = zzbx2.zzo();
                        if (zzo2 != null) {
                            if (((Boolean) zzbfc.zzf.zze()).booleanValue()) {
                                if (((Boolean) zzbd.zzc().zzb(zzbde.zzlE)).booleanValue()) {
                                    zzf.zza.post(new zzel(this, zzo2));
                                }
                            }
                            viewGroup.addView((View) ObjectWrapper.unwrap(zzo2));
                        }
                    } catch (RemoteException e) {
                        zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            zzek.zzp(currentTimeMillis);
            if (zzek.zzc() != 0) {
                this.zzq.set(zzek.zzc());
            }
            zzbx zzbx3 = this.zzj;
            if (zzbx3 != null) {
                AtomicLong atomicLong = this.zzq;
                if (atomicLong.get() != 0) {
                    zzbx3.zzR(atomicLong.get());
                }
                zzbx3.zzad(this.zzc.zza(this.zzm.getContext(), zzek));
                return;
            }
            throw null;
        } catch (RemoteException e2) {
            zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzo() {
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzA();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        if (!this.zzd.getAndSet(true)) {
            try {
                zzbx zzbx = this.zzj;
                if (zzbx != null) {
                    zzbx.zzB();
                }
            } catch (RemoteException e) {
                zzo.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzq() {
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzC();
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(zza zza2) {
        try {
            this.zzf = zza2;
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzD(zza2 != null ? new zzb(zza2) : null);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzs(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzt(AdSize... adSizeArr) {
        if (this.zzh == null) {
            zzu(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzu(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzG(zzF(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzv(String str) {
        if (this.zzl == null) {
            this.zzl = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void zzw(AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzH(appEventListener != null ? new zzazr(appEventListener) : null);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(boolean z) {
        this.zzo = z;
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzO(z);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzQ(new zzfu(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzz(long j) {
        this.zzq.set(j);
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                zzbx.zzR(j);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzq.zza, (zzbx) null, 0);
    }

    public final void zzA(VideoOptions videoOptions) {
        zzgc zzgc;
        this.zzk = videoOptions;
        try {
            zzbx zzbx = this.zzj;
            if (zzbx != null) {
                if (videoOptions == null) {
                    zzgc = null;
                } else {
                    zzgc = new zzgc(videoOptions);
                }
                zzbx.zzW(zzgc);
            }
        } catch (RemoteException e) {
            zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzq.zza, (zzbx) null, i);
    }

    zzen(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzq zzq2, zzbx zzbx, int i) {
        zzr zzr;
        ViewGroup viewGroup2 = viewGroup;
        AttributeSet attributeSet2 = attributeSet;
        this.zzb = new zzbpm();
        this.zze = new VideoController();
        this.zza = new zzem(this);
        this.zzq = new AtomicLong();
        this.zzm = viewGroup2;
        this.zzc = zzq2;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet2 != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzz = new zzz(context, attributeSet2);
                this.zzh = zzz.zzb(z);
                this.zzl = zzz.zza();
                if (viewGroup.isInEditMode()) {
                    zzf zzb2 = zzbb.zzb();
                    AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzr = new zzr("invalid", 0, 0, false, 0, 0, (zzr[]) null, false, false, false, true, false, false, false, false);
                    } else {
                        zzr zzr2 = new zzr(context, adSize);
                        zzr2.zzj = zzG(i2);
                        zzr = zzr2;
                    }
                    zzb2.zzr(viewGroup2, zzr, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzbb.zzb().zzq(viewGroup2, new zzr(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
