package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdjn extends zzbgy implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdkr {
    private final WeakReference zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private zzdio zze;
    private zzaze zzf;

    public zzdjn(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        zzv.zzz();
        zzcas.zza(view, this);
        zzv.zzz();
        zzcas.zzb(view, this);
        this.zza = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.zzb.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.zzd.putAll(this.zzb);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.zzc.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.zzd.putAll(this.zzc);
        this.zzf = new zzaze(view.getContext(), view);
    }

    public final synchronized void onClick(View view) {
        zzdio zzdio = this.zze;
        if (zzdio != null) {
            zzdio.zzE(view, zzf(), zzl(), zzm(), true);
        }
    }

    public final synchronized void onGlobalLayout() {
        zzdio zzdio = this.zze;
        if (zzdio != null) {
            zzdio.zzC(zzf(), zzl(), zzm(), zzdio.zzZ(zzf()));
        }
    }

    public final synchronized void onScrollChanged() {
        zzdio zzdio = this.zze;
        if (zzdio != null) {
            zzdio.zzC(zzf(), zzl(), zzm(), zzdio.zzZ(zzf()));
        }
    }

    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        zzdio zzdio = this.zze;
        if (zzdio != null) {
            zzdio.zzM(view, motionEvent, zzf());
        }
        return false;
    }

    public final synchronized void zzb(IObjectWrapper iObjectWrapper) {
        if (this.zze != null) {
            Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
            if (!(unwrap instanceof View)) {
                int i = zze.zza;
                zzo.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
            }
            this.zze.zzO((View) unwrap);
        }
    }

    public final synchronized void zzc(IObjectWrapper iObjectWrapper) {
        Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
        if (!(unwrap instanceof zzdio)) {
            int i = zze.zza;
            zzo.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
            return;
        }
        zzdio zzdio = this.zze;
        if (zzdio != null) {
            zzdio.zzU(this);
        }
        zzdio zzdio2 = (zzdio) unwrap;
        if (zzdio2.zzV()) {
            this.zze = zzdio2;
            zzdio2.zzT(this);
            this.zze.zzL(zzf());
            return;
        }
        int i2 = zze.zza;
        zzo.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
    }

    public final synchronized void zzd() {
        zzdio zzdio = this.zze;
        if (zzdio != null) {
            zzdio.zzU(this);
            this.zze = null;
        }
    }

    public final View zzf() {
        return (View) this.zza.get();
    }

    public final synchronized View zzg(String str) {
        WeakReference weakReference = (WeakReference) this.zzd.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    public final FrameLayout zzh() {
        return null;
    }

    public final zzaze zzi() {
        return this.zzf;
    }

    public final synchronized IObjectWrapper zzj() {
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockFinish
        jadx.core.utils.exceptions.JadxRuntimeException: Dominance frontier not set for block: B:4:0x0005
        	at jadx.core.dex.nodes.BlockNode.lock(BlockNode.java:75)
        	at jadx.core.utils.ImmutableList.forEach(ImmutableList.java:108)
        	at jadx.core.dex.nodes.MethodNode.finishBasicBlocks(MethodNode.java:472)
        	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:27)
        */
    public final synchronized java.lang.String zzk() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = "1007"
            monitor-exit(r1)
            return r0
        L_0x0005:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0005 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjn.zzk():java.lang.String");
    }

    public final synchronized Map zzl() {
        return this.zzd;
    }

    public final synchronized Map zzm() {
        return this.zzb;
    }

    public final synchronized Map zzn() {
        return this.zzc;
    }

    public final synchronized JSONObject zzo() {
        return null;
    }

    public final synchronized JSONObject zzp() {
        zzdio zzdio = this.zze;
        if (zzdio == null) {
            return null;
        }
        return zzdio.zzj(zzf(), zzl(), zzm());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzq(java.lang.String r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r4.<init>(r3)     // Catch:{ all -> 0x0034 }
            java.util.Map r0 = r1.zzd     // Catch:{ all -> 0x0034 }
            r0.put(r2, r4)     // Catch:{ all -> 0x0034 }
            java.lang.String r4 = "1098"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0032
            java.lang.String r4 = "3011"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x001c
            goto L_0x0032
        L_0x001c:
            java.util.Map r4 = r1.zzb     // Catch:{ all -> 0x0034 }
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0034 }
            r2 = 1
            r3.setClickable(r2)     // Catch:{ all -> 0x0034 }
            r3.setOnClickListener(r1)     // Catch:{ all -> 0x0034 }
            r3.setOnTouchListener(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r1)
            return
        L_0x0032:
            monitor-exit(r1)
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0034 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjn.zzq(java.lang.String, android.view.View, boolean):void");
    }
}
