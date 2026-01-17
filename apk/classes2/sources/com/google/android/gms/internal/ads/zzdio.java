package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdt;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdio extends zzcra {
    public static final zzfyq zzc = zzfyq.zzs("3010", "3008", "1005", "1009", "2011", "2007");
    private final List zzA = new ArrayList();
    private final Executor zzd;
    /* access modifiers changed from: private */
    public final zzdit zze;
    private final zzdjb zzf;
    private final zzdjt zzg;
    private final zzdiy zzh;
    private final zzdje zzi;
    private final zzhgl zzj;
    private final zzhgl zzk;
    private final zzhgl zzl;
    private final zzhgl zzm;
    private final zzhgl zzn;
    /* access modifiers changed from: private */
    public zzdkr zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private final zzbyk zzt;
    private final zzavu zzu;
    private final VersionInfoParcel zzv;
    private final Context zzw;
    private final zzdiq zzx;
    private final zzelb zzy;
    /* access modifiers changed from: private */
    public final Map zzz = new HashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzdio(zzcqz zzcqz, Executor executor, zzdit zzdit, zzdjb zzdjb, zzdjt zzdjt, zzdiy zzdiy, zzdje zzdje, zzhgl zzhgl, zzhgl zzhgl2, zzhgl zzhgl3, zzhgl zzhgl4, zzhgl zzhgl5, zzbyk zzbyk, zzavu zzavu, VersionInfoParcel versionInfoParcel, Context context, zzdiq zzdiq, zzelb zzelb, zzazf zzazf) {
        super(zzcqz);
        this.zzd = executor;
        this.zze = zzdit;
        this.zzf = zzdjb;
        this.zzg = zzdjt;
        this.zzh = zzdiy;
        this.zzi = zzdje;
        this.zzj = zzhgl;
        this.zzk = zzhgl2;
        this.zzl = zzhgl3;
        this.zzm = zzhgl4;
        this.zzn = zzhgl5;
        this.zzt = zzbyk;
        this.zzu = zzavu;
        this.zzv = versionInfoParcel;
        this.zzw = context;
        this.zzx = zzdiq;
        this.zzy = zzelb;
    }

    public static boolean zzZ(View view) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzla)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point());
        }
        zzv.zzr();
        long zzx2 = zzs.zzx(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), new Point())) {
            if (zzx2 >= ((long) ((Integer) zzbd.zzc().zzb(zzbde.zzlb)).intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized android.view.View zzab(java.util.Map r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 != 0) goto L_0x0004
            goto L_0x0025
        L_0x0004:
            com.google.android.gms.internal.ads.zzfyq r0 = zzc     // Catch:{ all -> 0x0028 }
            int r1 = r0.size()     // Catch:{ all -> 0x0028 }
            r2 = 0
        L_0x000b:
            if (r2 >= r1) goto L_0x0025
            java.lang.Object r3 = r0.get(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0028 }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x0028 }
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch:{ all -> 0x0028 }
            int r2 = r2 + 1
            if (r3 == 0) goto L_0x000b
            java.lang.Object r5 = r3.get()     // Catch:{ all -> 0x0028 }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)
            return r5
        L_0x0025:
            monitor-exit(r4)
            r5 = 0
            return r5
        L_0x0028:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdio.zzab(java.util.Map):android.view.View");
    }

    private final synchronized ImageView.ScaleType zzac() {
        zzdkr zzdkr = this.zzo;
        if (zzdkr == null) {
            int i = zze.zza;
            zzo.zze("Ad should be associated with an ad view before calling getMediaviewScaleType()");
            return null;
        }
        IObjectWrapper zzj2 = zzdkr.zzj();
        if (zzj2 != null) {
            return (ImageView.ScaleType) ObjectWrapper.unwrap(zzj2);
        }
        return zzdjt.zza;
    }

    private final void zzad(String str, boolean z) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfG)).booleanValue()) {
            ListenableFuture zzw2 = this.zze.zzw();
            if (zzw2 != null) {
                zzgdn.zzr(zzw2, new zzdim(this, "Google", true), this.zzd);
                return;
            }
            return;
        }
        zzf("Google", true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzae(android.view.View r9, java.util.Map r10, java.util.Map r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.zzr     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0007
            goto L_0x00d5
        L_0x0007:
            android.view.View r0 = r8.zzab(r10)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zznM     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r2.zzb(r1)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00d7 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00d7 }
            r2 = 1
            if (r1 == 0) goto L_0x0051
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ all -> 0x00d7 }
            r1.<init>()     // Catch:{ all -> 0x00d7 }
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ all -> 0x00d7 }
            r3.<init>()     // Catch:{ all -> 0x00d7 }
            boolean r3 = r0.getGlobalVisibleRect(r1, r3)     // Catch:{ all -> 0x00d7 }
            if (r3 == 0) goto L_0x00d5
            int r3 = r0.getHeight()     // Catch:{ all -> 0x00d7 }
            int r4 = r1.height()     // Catch:{ all -> 0x00d7 }
            if (r3 != r4) goto L_0x00d5
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d7 }
            int r1 = r1.width()     // Catch:{ all -> 0x00d7 }
            if (r0 != r1) goto L_0x00d5
            com.google.android.gms.internal.ads.zzdjb r0 = r8.zzf     // Catch:{ all -> 0x00d7 }
            android.widget.ImageView$ScaleType r1 = r8.zzac()     // Catch:{ all -> 0x00d7 }
            r0.zzr(r9, r10, r11, r1)     // Catch:{ all -> 0x00d7 }
            r8.zzr = r2     // Catch:{ all -> 0x00d7 }
            monitor-exit(r8)
            return
        L_0x0051:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zznN     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r3.zzb(r1)     // Catch:{ all -> 0x00d7 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x00d7 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00d7 }
            if (r1 == 0) goto L_0x0076
            boolean r0 = zzZ(r0)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzdjb r0 = r8.zzf     // Catch:{ all -> 0x00d7 }
            android.widget.ImageView$ScaleType r1 = r8.zzac()     // Catch:{ all -> 0x00d7 }
            r0.zzr(r9, r10, r11, r1)     // Catch:{ all -> 0x00d7 }
            r8.zzr = r2     // Catch:{ all -> 0x00d7 }
            monitor-exit(r8)
            return
        L_0x0076:
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zznO     // Catch:{ all -> 0x00d7 }
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r3 = r3.zzb(r1)     // Catch:{ all -> 0x00d7 }
            java.lang.Float r3 = (java.lang.Float) r3     // Catch:{ all -> 0x00d7 }
            float r3 = r3.floatValue()     // Catch:{ all -> 0x00d7 }
            double r3 = (double) r3     // Catch:{ all -> 0x00d7 }
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00d7 }
            java.lang.Object r1 = r3.zzb(r1)     // Catch:{ all -> 0x00d7 }
            java.lang.Float r1 = (java.lang.Float) r1     // Catch:{ all -> 0x00d7 }
            float r1 = r1.floatValue()     // Catch:{ all -> 0x00d7 }
            double r3 = (double) r1     // Catch:{ all -> 0x00d7 }
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ all -> 0x00d7 }
            r1.<init>()     // Catch:{ all -> 0x00d7 }
            android.graphics.Point r5 = new android.graphics.Point     // Catch:{ all -> 0x00d7 }
            r5.<init>()     // Catch:{ all -> 0x00d7 }
            boolean r5 = r0.getGlobalVisibleRect(r1, r5)     // Catch:{ all -> 0x00d7 }
            if (r5 == 0) goto L_0x00d5
            int r5 = r1.height()     // Catch:{ all -> 0x00d7 }
            int r1 = r1.width()     // Catch:{ all -> 0x00d7 }
            int r5 = r5 * r1
            int r1 = r0.getHeight()     // Catch:{ all -> 0x00d7 }
            int r0 = r0.getWidth()     // Catch:{ all -> 0x00d7 }
            int r1 = r1 * r0
            r6 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 / r6
            double r0 = (double) r1     // Catch:{ all -> 0x00d7 }
            double r5 = (double) r5     // Catch:{ all -> 0x00d7 }
            double r0 = r0 * r3
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00d5
            com.google.android.gms.internal.ads.zzdjb r0 = r8.zzf     // Catch:{ all -> 0x00d7 }
            android.widget.ImageView$ScaleType r1 = r8.zzac()     // Catch:{ all -> 0x00d7 }
            r0.zzr(r9, r10, r11, r1)     // Catch:{ all -> 0x00d7 }
            r8.zzr = r2     // Catch:{ all -> 0x00d7 }
            monitor-exit(r8)
            return
        L_0x00d5:
            monitor-exit(r8)
            return
        L_0x00d7:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00d7 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdio.zzae(android.view.View, java.util.Map, java.util.Map):void");
    }

    private final synchronized void zzaf(View view, Map map, Map map2) {
        this.zzg.zzd(this.zzo);
        this.zzf.zzt(view, map, map2, zzac());
        this.zzq = true;
    }

    /* access modifiers changed from: private */
    public final void zzag(View view, zzedh zzedh) {
        zzcfg zzr2 = this.zze.zzr();
        if (this.zzh.zzd() && zzedh != null && zzr2 != null && view != null) {
            zzv.zzC().zzj(zzedh.zza(), view);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzah(com.google.android.gms.internal.ads.zzdkr r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.zzp     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0007
            goto L_0x00b9
        L_0x0007:
            r7.zzo = r8     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdjt r0 = r7.zzg     // Catch:{ all -> 0x00bb }
            r0.zze(r8)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdjb r1 = r7.zzf     // Catch:{ all -> 0x00bb }
            android.view.View r2 = r8.zzf()     // Catch:{ all -> 0x00bb }
            java.util.Map r3 = r8.zzm()     // Catch:{ all -> 0x00bb }
            java.util.Map r4 = r8.zzn()     // Catch:{ all -> 0x00bb }
            r5 = r8
            r6 = r8
            r1.zzB(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzcT     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0042
            com.google.android.gms.internal.ads.zzavu r0 = r7.zzu     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzavp r0 = r0.zzc()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0042
            android.view.View r1 = r8.zzf()     // Catch:{ all -> 0x00bb }
            r0.zzo(r1)     // Catch:{ all -> 0x00bb }
        L_0x0042:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbW     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x00bb }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00bb }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00a8
            com.google.android.gms.internal.ads.zzfca r0 = r7.zzb     // Catch:{ all -> 0x00bb }
            boolean r1 = r0.zzak     // Catch:{ all -> 0x00bb }
            if (r1 != 0) goto L_0x005b
            goto L_0x00a8
        L_0x005b:
            org.json.JSONObject r0 = r0.zzaj     // Catch:{ all -> 0x00bb }
            java.util.Iterator r0 = r0.keys()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00a8
        L_0x0063:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00a8
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdkr r2 = r7.zzo     // Catch:{ all -> 0x00bb }
            if (r2 != 0) goto L_0x0075
            r2 = 0
            goto L_0x007f
        L_0x0075:
            java.util.Map r2 = r2.zzl()     // Catch:{ all -> 0x00bb }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x00bb }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x00bb }
        L_0x007f:
            java.util.Map r3 = r7.zzz     // Catch:{ all -> 0x00bb }
            r4 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x00bb }
            r3.put(r1, r4)     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0063
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x00bb }
            android.view.View r2 = (android.view.View) r2     // Catch:{ all -> 0x00bb }
            if (r2 == 0) goto L_0x0063
            android.content.Context r3 = r7.zzw     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzaze r4 = new com.google.android.gms.internal.ads.zzaze     // Catch:{ all -> 0x00bb }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x00bb }
            java.util.List r2 = r7.zzA     // Catch:{ all -> 0x00bb }
            r2.add(r4)     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzdil r2 = new com.google.android.gms.internal.ads.zzdil     // Catch:{ all -> 0x00bb }
            r2.<init>(r7, r1)     // Catch:{ all -> 0x00bb }
            r4.zzd(r2)     // Catch:{ all -> 0x00bb }
            goto L_0x0063
        L_0x00a8:
            com.google.android.gms.internal.ads.zzaze r0 = r8.zzi()     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x00b9
            com.google.android.gms.internal.ads.zzaze r8 = r8.zzi()     // Catch:{ all -> 0x00bb }
            com.google.android.gms.internal.ads.zzbyk r0 = r7.zzt     // Catch:{ all -> 0x00bb }
            r8.zzd(r0)     // Catch:{ all -> 0x00bb }
            monitor-exit(r7)
            return
        L_0x00b9:
            monitor-exit(r7)
            return
        L_0x00bb:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00bb }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdio.zzah(com.google.android.gms.internal.ads.zzdkr):void");
    }

    /* access modifiers changed from: private */
    public final void zzai(zzdkr zzdkr) {
        this.zzf.zzC(zzdkr.zzf(), zzdkr.zzl());
        if (zzdkr.zzh() != null) {
            zzdkr.zzh().setClickable(false);
            zzdkr.zzh().removeAllViews();
        }
        if (zzdkr.zzi() != null) {
            zzdkr.zzi().zze(this.zzt);
        }
        this.zzo = null;
    }

    public static /* synthetic */ void zzt(zzdio zzdio, boolean z) {
        zzdkr zzdkr = zzdio.zzo;
        if (zzdkr == null) {
            int i = zze.zza;
            zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        zzdio.zzf.zzq((View) null, zzdkr.zzf(), zzdio.zzo.zzl(), zzdio.zzo.zzm(), z, zzdio.zzac(), 0);
    }

    public static /* synthetic */ void zzv(zzdio zzdio, View view, boolean z, int i) {
        zzdkr zzdkr = zzdio.zzo;
        if (zzdkr == null) {
            int i2 = zze.zza;
            zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
            return;
        }
        zzdio.zzf.zzq(view, zzdkr.zzf(), zzdio.zzo.zzl(), zzdio.zzo.zzm(), z, zzdio.zzac(), i);
    }

    public static /* synthetic */ void zzw(zzdio zzdio) {
        zzdio.zzf.zzk();
        zzdio.zze.zzI();
    }

    public final void zzA(View view) {
        zzedh zzu2 = this.zze.zzu();
        if (this.zzh.zzd() && zzu2 != null && view != null) {
            zzv.zzC().zzg(zzu2.zza(), view);
        }
    }

    public final synchronized void zzB() {
        this.zzf.zzj();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzC(android.view.View r4, java.util.Map r5, java.util.Map r6, boolean r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzq     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x000a
            r3.zzae(r4, r5, r6)     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            return
        L_0x000a:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbW     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ all -> 0x0092 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0045
            com.google.android.gms.internal.ads.zzfca r0 = r3.zzb     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.zzak     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0045
            java.util.Map r0 = r3.zzz     // Catch:{ all -> 0x0092 }
            java.util.Set r1 = r0.keySet()     // Catch:{ all -> 0x0092 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0092 }
        L_0x002c:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0092 }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x0092 }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r2 != 0) goto L_0x002c
            goto L_0x0088
        L_0x0045:
            if (r7 != 0) goto L_0x008a
            com.google.android.gms.internal.ads.zzbcv r7 = com.google.android.gms.internal.ads.zzbde.zzeh     // Catch:{ all -> 0x0092 }
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ all -> 0x0092 }
            java.lang.Object r7 = r0.zzb(r7)     // Catch:{ all -> 0x0092 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0092 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0092 }
            if (r7 == 0) goto L_0x0088
            if (r5 == 0) goto L_0x0088
            java.util.Set r7 = r5.entrySet()     // Catch:{ all -> 0x0092 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0092 }
        L_0x0063:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x0092 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0092 }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x0092 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0092 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = zzZ(r0)     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0063
            r3.zzaf(r4, r5, r6)     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            return
        L_0x0088:
            monitor-exit(r3)
            return
        L_0x008a:
            r3.zzaf(r4, r5, r6)     // Catch:{ all -> 0x0092 }
            r3.zzae(r4, r5, r6)     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            return
        L_0x0092:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdio.zzC(android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzD(zzdj zzdj) {
        this.zzf.zzl(zzdj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzE(android.view.View r10, android.view.View r11, java.util.Map r12, java.util.Map r13, boolean r14) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzdjt r0 = r9.zzg     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzdkr r1 = r9.zzo     // Catch:{ all -> 0x0037 }
            r0.zzc(r1)     // Catch:{ all -> 0x0037 }
            android.widget.ImageView$ScaleType r8 = r9.zzac()     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzdjb r2 = r9.zzf     // Catch:{ all -> 0x0037 }
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.zzm(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0037 }
            boolean r10 = r9.zzs     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x0035
            com.google.android.gms.internal.ads.zzdit r10 = r9.zze     // Catch:{ all -> 0x0037 }
            com.google.android.gms.internal.ads.zzcfg r11 = r10.zzs()     // Catch:{ all -> 0x0037 }
            if (r11 != 0) goto L_0x0023
            goto L_0x0035
        L_0x0023:
            com.google.android.gms.internal.ads.zzcfg r10 = r10.zzs()     // Catch:{ all -> 0x0037 }
            if (r10 == 0) goto L_0x0035
            androidx.collection.ArrayMap r11 = new androidx.collection.ArrayMap     // Catch:{ all -> 0x0037 }
            r11.<init>()     // Catch:{ all -> 0x0037 }
            java.lang.String r12 = "onSdkAdUserInteractionClick"
            r10.zzd(r12, r11)     // Catch:{ all -> 0x0037 }
            monitor-exit(r9)
            return
        L_0x0035:
            monitor-exit(r9)
            return
        L_0x0037:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0037 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdio.zzE(android.view.View, android.view.View, java.util.Map, java.util.Map, boolean):void");
    }

    public final synchronized void zzF(View view, int i) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlW)).booleanValue()) {
            zzdkr zzdkr = this.zzo;
            if (zzdkr == null) {
                int i2 = zze.zza;
                zzo.zze("Ad should be associated with an ad view before calling performClickForCustomGesture()");
                return;
            }
            this.zzd.execute(new zzdii(this, view, zzdkr instanceof zzdjn, i));
        }
    }

    public final synchronized void zzG(String str) {
        this.zzf.zzn(str);
    }

    public final synchronized void zzH(Bundle bundle) {
        this.zzf.zzo(bundle);
    }

    public final synchronized void zzI() {
        zzdkr zzdkr = this.zzo;
        if (zzdkr == null) {
            int i = zze.zza;
            zzo.zze("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            return;
        }
        this.zzd.execute(new zzdik(this, zzdkr instanceof zzdjn));
    }

    public final void zzJ(Bundle bundle) {
        zzcfg zzs2 = this.zze.zzs();
        if (zzs2 == null) {
            int i = zze.zza;
            zzo.zzg("Video webview is null");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : bundle.keySet()) {
                jSONObject.put(str, bundle.get(str));
            }
            this.zzd.execute(new zzdih(zzs2, jSONObject));
        } catch (JSONException e) {
            int i2 = zze.zza;
            zzo.zzh("Error reading event signals", e);
        }
    }

    public final synchronized void zzK() {
        if (!this.zzq) {
            this.zzf.zzu();
        }
    }

    public final void zzL(View view) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzfG)).booleanValue()) {
            zzdit zzdit = this.zze;
            if (zzdit.zzc() != 3) {
                zzcak zzp2 = zzdit.zzp();
                if (zzp2 != null) {
                    zzgdn.zzr(zzp2, new zzdin(this, view), this.zzd);
                    return;
                }
                return;
            }
        }
        zzag(view, this.zze.zzu());
    }

    public final synchronized void zzM(View view, MotionEvent motionEvent, View view2) {
        this.zzf.zzv(view, motionEvent, view2);
    }

    public final synchronized void zzN(Bundle bundle) {
        this.zzf.zzw(bundle);
    }

    public final synchronized void zzO(View view) {
        this.zzf.zzx(view);
    }

    public final synchronized void zzP() {
        this.zzf.zzy();
    }

    public final synchronized void zzQ(zzdf zzdf) {
        this.zzf.zzz(zzdf);
    }

    public final synchronized void zzR(zzdt zzdt) {
        this.zzy.zza(zzdt);
    }

    public final synchronized void zzS(zzbig zzbig) {
        this.zzf.zzA(zzbig);
    }

    public final synchronized void zzT(zzdkr zzdkr) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbU)).booleanValue()) {
            zzs.zza.post(new zzdid(this, zzdkr));
        } else {
            zzah(zzdkr);
        }
    }

    public final synchronized void zzU(zzdkr zzdkr) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzbU)).booleanValue()) {
            zzs.zza.post(new zzdie(this, zzdkr));
        } else {
            zzai(zzdkr);
        }
    }

    public final boolean zzV() {
        return this.zzh.zze();
    }

    public final synchronized boolean zzW() {
        return this.zzf.zzD();
    }

    public final synchronized boolean zzX() {
        return this.zzf.zzE();
    }

    public final boolean zzY() {
        return this.zzh.zzd();
    }

    public final synchronized int zza() {
        return this.zzf.zza();
    }

    public final synchronized boolean zzaa(Bundle bundle) {
        if (this.zzq) {
            return true;
        }
        boolean zzF = this.zzf.zzF(bundle);
        this.zzq = zzF;
        return zzF;
    }

    public final synchronized void zzb() {
        this.zzp = true;
        this.zzd.execute(new zzdij(this));
        super.zzb();
    }

    public final zzdiq zzc() {
        return this.zzx;
    }

    public final zzedh zzf(String str, boolean z) {
        boolean z2;
        String str2;
        zzedd zzedd;
        zzede zzede;
        String str3;
        zzdiy zzdiy = this.zzh;
        if (zzdiy.zzd() && !TextUtils.isEmpty(str)) {
            zzdit zzdit = this.zze;
            zzcfg zzr2 = zzdit.zzr();
            zzcfg zzs2 = zzdit.zzs();
            if (zzr2 == null && zzs2 == null) {
                int i = zze.zza;
                zzo.zzj("Omid display and video webview are null. Skipping initialization.");
                return null;
            }
            zzdiy.zza();
            int zzc2 = zzdiy.zza().zzc();
            int i2 = zzc2 - 1;
            boolean z3 = false;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (zzc2 != 1) {
                        str3 = zzc2 != 2 ? "UNKNOWN" : "DISPLAY";
                    } else {
                        str3 = "VIDEO";
                    }
                    int i3 = zze.zza;
                    zzo.zzj("Unknown omid media type: " + str3 + ". Not initializing Omid.");
                    return null;
                } else if (zzr2 != null) {
                    z2 = false;
                    z3 = true;
                } else {
                    int i4 = zze.zza;
                    zzo.zzj("Omid media type was display but there was no display webview.");
                    return null;
                }
            } else if (zzs2 != null) {
                z2 = true;
            } else {
                int i5 = zze.zza;
                zzo.zzj("Omid media type was video but there was no video webview.");
            }
            if (z3) {
                str2 = null;
            } else {
                str2 = "javascript";
                zzr2 = zzs2;
            }
            if (zzr2 != null) {
                if (!zzv.zzC().zzl(this.zzw)) {
                    int i6 = zze.zza;
                    zzo.zzj("Failed to initialize omid in InternalNativeAd");
                    return null;
                }
                VersionInfoParcel versionInfoParcel = this.zzv;
                String str4 = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                if (z2) {
                    zzedd = zzedd.VIDEO;
                    zzede = zzede.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzedd = zzedd.NATIVE_DISPLAY;
                    if (zzdit.zzc() == 3) {
                        zzede = zzede.UNSPECIFIED;
                    } else {
                        zzede = zzede.ONE_PIXEL;
                    }
                }
                zzedh zzb = zzv.zzC().zzb(str4, zzr2.zzG(), "", "javascript", str2, str, zzede, zzedd, this.zzb.zzal);
                if (zzb == null) {
                    int i7 = zze.zza;
                    zzo.zzj("Failed to create omid session in InternalNativeAd");
                    return null;
                }
                zzdit.zzW(zzb);
                zzr2.zzat(zzb);
                if (z2) {
                    zzfll zza = zzb.zza();
                    if (zzs2 != null) {
                        zzv.zzC().zzj(zza, zzs2.zzF());
                    }
                    this.zzs = true;
                }
                if (z) {
                    zzv.zzC().zzk(zzb.zza());
                    zzr2.zzd("onSdkLoaded", new ArrayMap());
                }
                return zzb;
            }
            int i8 = zze.zza;
            zzo.zzj("Webview is null in InternalNativeAd");
            return null;
        }
        return null;
    }

    public final String zzg() {
        return this.zzh.zzb();
    }

    public final synchronized JSONObject zzi(View view, Map map, Map map2) {
        return this.zzf.zzf(view, map, map2, zzac());
    }

    public final synchronized JSONObject zzj(View view, Map map, Map map2) {
        return this.zzf.zzg(view, map, map2, zzac());
    }

    public final void zzk() {
        zzdif zzdif = new zzdif(this);
        Executor executor = this.zzd;
        executor.execute(zzdif);
        if (this.zze.zzc() != 7) {
            zzdjb zzdjb = this.zzf;
            Objects.requireNonNull(zzdjb);
            executor.execute(new zzdig(zzdjb));
        }
        super.zzk();
    }

    public static /* synthetic */ void zzu(zzdio zzdio) {
        try {
            zzdit zzdit = zzdio.zze;
            int zzc2 = zzdit.zzc();
            if (zzc2 == 1) {
                zzbhq zzb = zzdio.zzi.zzb();
                if (zzb != null) {
                    zzdio.zzad("Google", true);
                    zzb.zze((zzbhg) zzdio.zzj.zzb());
                }
            } else if (zzc2 == 2) {
                zzbhn zza = zzdio.zzi.zza();
                if (zza != null) {
                    zzdio.zzad("Google", true);
                    zza.zze((zzbhe) zzdio.zzk.zzb());
                }
            } else if (zzc2 == 3) {
                zzbhw zzd2 = zzdio.zzi.zzd(zzdit.zzA());
                if (zzd2 != null) {
                    if (zzdit.zzs() != null) {
                        zzdio.zzf("Google", true);
                    }
                    zzd2.zze((zzbhj) zzdio.zzn.zzb());
                }
            } else if (zzc2 == 6) {
                zzbid zzf2 = zzdio.zzi.zzf();
                if (zzf2 != null) {
                    zzdio.zzad("Google", true);
                    zzf2.zze((zzbij) zzdio.zzl.zzb());
                }
            } else if (zzc2 != 7) {
                int i = zze.zza;
                zzo.zzg("Wrong native template id!");
            } else {
                zzbmy zzg2 = zzdio.zzi.zzg();
                if (zzg2 != null) {
                    zzg2.zzg((zzbms) zzdio.zzm.zzb());
                }
            }
        } catch (RemoteException e) {
            int i2 = zze.zza;
            zzo.zzh("RemoteException when notifyAdLoad is called", e);
        }
    }
}
