package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzfu;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbsz extends NativeAd {
    private final zzbij zza;
    private final List zzb = new ArrayList();
    private final zzbsy zzc;
    private final NativeAd.AdChoicesInfo zzd;
    private final List zze = new ArrayList();
    private final AtomicLong zzf = new AtomicLong();

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e A[Catch:{ RemoteException -> 0x00ab }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbsz(com.google.android.gms.internal.ads.zzbij r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>()
            r5.zzf = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzv()     // Catch:{ RemoteException -> 0x004a }
            if (r6 == 0) goto L_0x004e
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x004a }
        L_0x0027:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x004a }
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x004a }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x004a }
            if (r3 == 0) goto L_0x003c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x004a }
            com.google.android.gms.internal.ads.zzbgp r2 = com.google.android.gms.internal.ads.zzbgo.zzh(r2)     // Catch:{ RemoteException -> 0x004a }
            goto L_0x003d
        L_0x003c:
            r2 = r1
        L_0x003d:
            if (r2 == 0) goto L_0x0027
            java.util.List r3 = r5.zzb     // Catch:{ RemoteException -> 0x004a }
            com.google.android.gms.internal.ads.zzbsy r4 = new com.google.android.gms.internal.ads.zzbsy     // Catch:{ RemoteException -> 0x004a }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x004a }
            r3.add(r4)     // Catch:{ RemoteException -> 0x004a }
            goto L_0x0027
        L_0x004a:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L_0x004e:
            com.google.android.gms.internal.ads.zzbij r6 = r5.zza     // Catch:{ RemoteException -> 0x007d }
            java.util.List r6 = r6.zzw()     // Catch:{ RemoteException -> 0x007d }
            if (r6 == 0) goto L_0x0081
            java.util.Iterator r6 = r6.iterator()     // Catch:{ RemoteException -> 0x007d }
        L_0x005a:
            boolean r2 = r6.hasNext()     // Catch:{ RemoteException -> 0x007d }
            if (r2 == 0) goto L_0x0081
            java.lang.Object r2 = r6.next()     // Catch:{ RemoteException -> 0x007d }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x007d }
            if (r3 == 0) goto L_0x006f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x007d }
            com.google.android.gms.ads.internal.client.zzdj r2 = com.google.android.gms.ads.internal.client.zzdi.zzb(r2)     // Catch:{ RemoteException -> 0x007d }
            goto L_0x0070
        L_0x006f:
            r2 = r1
        L_0x0070:
            if (r2 == 0) goto L_0x005a
            java.util.List r3 = r5.zze     // Catch:{ RemoteException -> 0x007d }
            com.google.android.gms.ads.internal.client.zzdk r4 = new com.google.android.gms.ads.internal.client.zzdk     // Catch:{ RemoteException -> 0x007d }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x007d }
            r3.add(r4)     // Catch:{ RemoteException -> 0x007d }
            goto L_0x005a
        L_0x007d:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L_0x0081:
            com.google.android.gms.internal.ads.zzbij r6 = r5.zza     // Catch:{ RemoteException -> 0x008f }
            com.google.android.gms.internal.ads.zzbgp r6 = r6.zzl()     // Catch:{ RemoteException -> 0x008f }
            if (r6 == 0) goto L_0x0093
            com.google.android.gms.internal.ads.zzbsy r2 = new com.google.android.gms.internal.ads.zzbsy     // Catch:{ RemoteException -> 0x008f }
            r2.<init>(r6)     // Catch:{ RemoteException -> 0x008f }
            goto L_0x0094
        L_0x008f:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L_0x0093:
            r2 = r1
        L_0x0094:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbij r6 = r5.zza     // Catch:{ RemoteException -> 0x00ab }
            com.google.android.gms.internal.ads.zzbgi r6 = r6.zzj()     // Catch:{ RemoteException -> 0x00ab }
            if (r6 == 0) goto L_0x00af
            com.google.android.gms.internal.ads.zzbsw r6 = new com.google.android.gms.internal.ads.zzbsw     // Catch:{ RemoteException -> 0x00ab }
            com.google.android.gms.internal.ads.zzbij r2 = r5.zza     // Catch:{ RemoteException -> 0x00ab }
            com.google.android.gms.internal.ads.zzbgi r2 = r2.zzj()     // Catch:{ RemoteException -> 0x00ab }
            r6.<init>(r2)     // Catch:{ RemoteException -> 0x00ab }
            r1 = r6
            goto L_0x00af
        L_0x00ab:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L_0x00af:
            r5.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsz.<init>(com.google.android.gms.internal.ads.zzbij):void");
    }

    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzx();
        } catch (RemoteException e) {
            zzo.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    public final void destroy() {
        try {
            this.zza.zzy();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void enableCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    public final String getAdvertiser() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final String getBody() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final String getCallToAction() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final Bundle getExtras() {
        try {
            Bundle zzg = this.zza.zzg();
            if (zzg != null) {
                return zzg;
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return new Bundle();
    }

    public final String getHeadline() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    public final MediaContent getMediaContent() {
        try {
            zzbij zzbij = this.zza;
            if (zzbij.zzk() != null) {
                return new zzff(zzbij.zzk(), (zzbhj) null);
            }
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
        return null;
    }

    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                long zzf2 = this.zza.zzf();
                AtomicLong atomicLong2 = this.zzf;
                atomicLong2.set(zzf2);
                j = atomicLong2.get();
            } catch (RemoteException e) {
                zzo.zzh("Failed to getPlacementId", e);
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    public final String getPrice() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final ResponseInfo getResponseInfo() {
        zzea zzea;
        try {
            zzea = this.zza.zzh();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            zzea = null;
        }
        return ResponseInfo.zza(zzea);
    }

    public final Double getStarRating() {
        try {
            double zze2 = this.zza.zze();
            if (zze2 == -1.0d) {
                return null;
            }
            return Double.valueOf(zze2);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final String getStore() {
        try {
            return this.zza.zzu();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }

    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzJ();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzK();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            if (this.zza.zzK()) {
                if (muteThisAdReason == null) {
                    try {
                        this.zza.zzz((zzdj) null);
                        return;
                    } catch (RemoteException e) {
                        zzo.zzh("", e);
                        return;
                    }
                } else if (muteThisAdReason instanceof zzdk) {
                    this.zza.zzz(((zzdk) muteThisAdReason).zza());
                    return;
                } else {
                    zzo.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                    return;
                }
            }
        } catch (RemoteException e2) {
            zzo.zzh("", e2);
        }
        zzo.zzg("Ad is not custom mute enabled");
    }

    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzA(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void recordCustomClickGesture() {
        try {
            this.zza.zzB();
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    /* access modifiers changed from: protected */
    public final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e) {
            zzo.zzh("Failed to record native event", e);
        }
    }

    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzL(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return false;
        }
    }

    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzD(bundle);
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzF(new zzdg(muteThisAdListener));
        } catch (RemoteException e) {
            zzo.zzh("", e);
        }
    }

    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzG(new zzfu(onPaidEventListener));
        } catch (RemoteException e) {
            zzo.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    public final void setPlacementId(long j) {
        try {
            this.zza.zzH(j);
            this.zzf.set(j);
        } catch (RemoteException e) {
            zzo.zzh("Failed to setPlacementId", e);
        }
    }

    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzI(new zzbtg(unconfirmedClickListener));
        } catch (RemoteException e) {
            zzo.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            zzo.zzh("", e);
            return null;
        }
    }
}
