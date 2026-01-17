package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.CollectionUtils;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbso extends zzbsu {
    private String zza = "top-right";
    private boolean zzb = true;
    private int zzc = 0;
    private int zzd = 0;
    private int zze = -1;
    private int zzf = 0;
    private int zzg = 0;
    private int zzh = -1;
    private final Object zzi = new Object();
    private final zzcfg zzj;
    private final Activity zzk;
    private zzchd zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsv zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    }

    public zzbso(zzcfg zzcfg, zzbsv zzbsv) {
        super(zzcfg, "resize");
        this.zzj = zzcfg;
        this.zzk = zzcfg.zzi();
        this.zzo = zzbsv;
    }

    /* access modifiers changed from: private */
    public final void zzm(boolean z) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzlm)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzln)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzlo)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcfg zzcfg = this.zzj;
                    viewGroup2.addView((View) zzcfg);
                    zzcfg.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    int i = zze.zza;
                    zzo.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcfg zzcfg2 = this.zzj;
                viewGroup3.addView((View) zzcfg2);
                zzcfg2.zzaj(this.zzl);
            }
        }
        if (z) {
            zzl("default");
            zzbsv zzbsv = this.zzo;
            if (zzbsv != null) {
                zzbsv.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zzb(boolean z) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzll)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzm(z);
                } else {
                    zzcaf.zzf.zza(new zzbsm(this, z));
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01fc A[Catch:{ RuntimeException -> 0x0410 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01fd A[Catch:{ RuntimeException -> 0x0410 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x025c A[Catch:{ RuntimeException -> 0x0410 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0263 A[Catch:{ RuntimeException -> 0x0410 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzc(java.util.Map r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "Cannot show popup window: "
            java.lang.Object r3 = r1.zzi
            monitor-enter(r3)
            android.app.Activity r4 = r1.zzk     // Catch:{ all -> 0x045b }
            if (r4 != 0) goto L_0x0014
            java.lang.String r0 = "Not an activity context. Cannot resize."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0014:
            com.google.android.gms.internal.ads.zzcfg r5 = r1.zzj     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzchd r6 = r5.zzO()     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x0023
            java.lang.String r0 = "Webview is not yet available, size is not set."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0023:
            com.google.android.gms.internal.ads.zzchd r6 = r5.zzO()     // Catch:{ all -> 0x045b }
            boolean r6 = r6.zzi()     // Catch:{ all -> 0x045b }
            if (r6 == 0) goto L_0x0034
            java.lang.String r0 = "Is interstitial. Cannot resize an interstitial."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0034:
            boolean r6 = r5.zzaF()     // Catch:{ all -> 0x045b }
            if (r6 == 0) goto L_0x0041
            java.lang.String r0 = "Cannot resize an expanded banner."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0041:
            java.lang.String r6 = "width"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x045b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x0060
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            java.lang.String r6 = "width"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x045b }
            int r6 = com.google.android.gms.ads.internal.util.zzs.zzP(r6)     // Catch:{ all -> 0x045b }
            r1.zzh = r6     // Catch:{ all -> 0x045b }
        L_0x0060:
            java.lang.String r6 = "height"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x045b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x007f
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            java.lang.String r6 = "height"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x045b }
            int r6 = com.google.android.gms.ads.internal.util.zzs.zzP(r6)     // Catch:{ all -> 0x045b }
            r1.zze = r6     // Catch:{ all -> 0x045b }
        L_0x007f:
            java.lang.String r6 = "offsetX"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x045b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x009e
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            java.lang.String r6 = "offsetX"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x045b }
            int r6 = com.google.android.gms.ads.internal.util.zzs.zzP(r6)     // Catch:{ all -> 0x045b }
            r1.zzf = r6     // Catch:{ all -> 0x045b }
        L_0x009e:
            java.lang.String r6 = "offsetY"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x045b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x00bd
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            java.lang.String r6 = "offsetY"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x045b }
            int r6 = com.google.android.gms.ads.internal.util.zzs.zzP(r6)     // Catch:{ all -> 0x045b }
            r1.zzg = r6     // Catch:{ all -> 0x045b }
        L_0x00bd:
            java.lang.String r6 = "allowOffscreen"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ all -> 0x045b }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x00d9
            java.lang.String r6 = "allowOffscreen"
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x045b }
            boolean r6 = java.lang.Boolean.parseBoolean(r6)     // Catch:{ all -> 0x045b }
            r1.zzb = r6     // Catch:{ all -> 0x045b }
        L_0x00d9:
            java.lang.String r6 = "customClosePosition"
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x045b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x045b }
            boolean r6 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x00e9
            r1.zza = r0     // Catch:{ all -> 0x045b }
        L_0x00e9:
            int r0 = r1.zzh     // Catch:{ all -> 0x045b }
            if (r0 < 0) goto L_0x0454
            int r0 = r1.zze     // Catch:{ all -> 0x045b }
            if (r0 < 0) goto L_0x0454
            android.view.Window r0 = r4.getWindow()     // Catch:{ all -> 0x045b }
            if (r0 == 0) goto L_0x044d
            android.view.View r6 = r0.getDecorView()     // Catch:{ all -> 0x045b }
            if (r6 != 0) goto L_0x00ff
            goto L_0x044d
        L_0x00ff:
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            int[] r6 = com.google.android.gms.ads.internal.util.zzs.zzW(r4)     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            int[] r7 = com.google.android.gms.ads.internal.util.zzs.zzS(r4)     // Catch:{ all -> 0x045b }
            r8 = 0
            r9 = r6[r8]     // Catch:{ all -> 0x045b }
            r10 = 1
            r6 = r6[r10]     // Catch:{ all -> 0x045b }
            int r11 = r1.zzh     // Catch:{ all -> 0x045b }
            r13 = 4
            r14 = 3
            r15 = 2
            r8 = 50
            r16 = 0
            if (r11 < r8) goto L_0x0253
            if (r11 <= r9) goto L_0x0122
            goto L_0x0253
        L_0x0122:
            int r12 = r1.zze     // Catch:{ all -> 0x045b }
            if (r12 < r8) goto L_0x024b
            if (r12 <= r6) goto L_0x012a
            goto L_0x024b
        L_0x012a:
            if (r12 != r6) goto L_0x0137
            if (r11 != r9) goto L_0x0137
            java.lang.String r6 = "Cannot resize to a full-screen ad."
            int r7 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)     // Catch:{ all -> 0x045b }
            goto L_0x025a
        L_0x0137:
            boolean r6 = r1.zzb     // Catch:{ all -> 0x045b }
            if (r6 == 0) goto L_0x020c
            java.lang.String r6 = r1.zza     // Catch:{ all -> 0x045b }
            int r17 = r6.hashCode()     // Catch:{ all -> 0x045b }
            switch(r17) {
                case -1364013995: goto L_0x0177;
                case -1012429441: goto L_0x016d;
                case -655373719: goto L_0x0163;
                case 1163912186: goto L_0x0159;
                case 1288627767: goto L_0x014f;
                case 1755462605: goto L_0x0145;
                default: goto L_0x0144;
            }
        L_0x0144:
            goto L_0x0181
        L_0x0145:
            java.lang.String r8 = "top-center"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0181
            r6 = r10
            goto L_0x0182
        L_0x014f:
            java.lang.String r8 = "bottom-center"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0181
            r6 = r13
            goto L_0x0182
        L_0x0159:
            java.lang.String r8 = "bottom-right"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0181
            r6 = 5
            goto L_0x0182
        L_0x0163:
            java.lang.String r8 = "bottom-left"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0181
            r6 = r14
            goto L_0x0182
        L_0x016d:
            java.lang.String r8 = "top-left"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0181
            r6 = 0
            goto L_0x0182
        L_0x0177:
            java.lang.String r8 = "center"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0181
            r6 = r15
            goto L_0x0182
        L_0x0181:
            r6 = -1
        L_0x0182:
            if (r6 == 0) goto L_0x01e2
            if (r6 == r10) goto L_0x01d4
            if (r6 == r15) goto L_0x01c0
            if (r6 == r14) goto L_0x01b3
            if (r6 == r13) goto L_0x01a5
            r8 = 5
            if (r6 == r8) goto L_0x019a
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r6 = r6 + r8
            int r6 = r6 + r11
            int r6 = r6 + -50
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
            goto L_0x01df
        L_0x019a:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r6 = r6 + r8
            int r6 = r6 + r11
            int r6 = r6 + -50
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
            goto L_0x01b0
        L_0x01a5:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r11 = r11 >> r10
            int r6 = r6 + r8
            int r6 = r6 + r11
            int r6 = r6 + -25
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
        L_0x01b0:
            int r11 = r1.zzg     // Catch:{ all -> 0x045b }
            goto L_0x01bb
        L_0x01b3:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r6 = r6 + r8
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
            goto L_0x01b0
        L_0x01bb:
            int r8 = r8 + r11
            int r8 = r8 + r12
            int r8 = r8 + -50
            goto L_0x01eb
        L_0x01c0:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r11 = r11 >> r10
            int r6 = r6 + r8
            int r6 = r6 + r11
            int r6 = r6 + -25
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
            int r11 = r1.zzg     // Catch:{ all -> 0x045b }
            int r8 = r8 + r11
            int r11 = r12 >> 1
            int r8 = r8 + r11
            int r8 = r8 + -25
            goto L_0x01eb
        L_0x01d4:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r11 = r11 >> r10
            int r6 = r6 + r8
            int r6 = r6 + r11
            int r6 = r6 + -25
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
        L_0x01df:
            int r11 = r1.zzg     // Catch:{ all -> 0x045b }
            goto L_0x01ea
        L_0x01e2:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r8 = r1.zzf     // Catch:{ all -> 0x045b }
            int r6 = r6 + r8
            int r8 = r1.zzd     // Catch:{ all -> 0x045b }
            goto L_0x01df
        L_0x01ea:
            int r8 = r8 + r11
        L_0x01eb:
            if (r6 < 0) goto L_0x025a
            r11 = 50
            int r6 = r6 + r11
            if (r6 > r9) goto L_0x025a
            r6 = 0
            r9 = r7[r6]     // Catch:{ all -> 0x045b }
            if (r8 < r9) goto L_0x025a
            int r8 = r8 + r11
            r6 = r7[r10]     // Catch:{ all -> 0x045b }
            if (r8 <= r6) goto L_0x01fd
            goto L_0x025a
        L_0x01fd:
            int r6 = r1.zzc     // Catch:{ all -> 0x045b }
            int r7 = r1.zzf     // Catch:{ all -> 0x045b }
            int r6 = r6 + r7
            int r7 = r1.zzd     // Catch:{ all -> 0x045b }
            int r8 = r1.zzg     // Catch:{ all -> 0x045b }
            int r7 = r7 + r8
            int[] r16 = new int[]{r6, r7}     // Catch:{ all -> 0x045b }
            goto L_0x025a
        L_0x020c:
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            int[] r6 = com.google.android.gms.ads.internal.util.zzs.zzW(r4)     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            int[] r7 = com.google.android.gms.ads.internal.util.zzs.zzS(r4)     // Catch:{ all -> 0x045b }
            r8 = 0
            r6 = r6[r8]     // Catch:{ all -> 0x045b }
            int r8 = r1.zzc     // Catch:{ all -> 0x045b }
            int r9 = r1.zzf     // Catch:{ all -> 0x045b }
            int r8 = r8 + r9
            int r9 = r1.zzd     // Catch:{ all -> 0x045b }
            int r11 = r1.zzg     // Catch:{ all -> 0x045b }
            int r9 = r9 + r11
            if (r8 >= 0) goto L_0x022c
            r6 = 0
        L_0x022a:
            r8 = 0
            goto L_0x0236
        L_0x022c:
            int r11 = r1.zzh     // Catch:{ all -> 0x045b }
            int r12 = r8 + r11
            if (r12 <= r6) goto L_0x0234
            int r6 = r6 - r11
            goto L_0x022a
        L_0x0234:
            r6 = r8
            goto L_0x022a
        L_0x0236:
            r11 = r7[r8]     // Catch:{ all -> 0x045b }
            if (r9 >= r11) goto L_0x023c
            r9 = r11
            goto L_0x0246
        L_0x023c:
            int r8 = r1.zze     // Catch:{ all -> 0x045b }
            int r11 = r9 + r8
            r7 = r7[r10]     // Catch:{ all -> 0x045b }
            if (r11 <= r7) goto L_0x0246
            int r9 = r7 - r8
        L_0x0246:
            int[] r16 = new int[]{r6, r9}     // Catch:{ all -> 0x045b }
            goto L_0x025a
        L_0x024b:
            java.lang.String r6 = "Height is too small or too large."
            int r7 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)     // Catch:{ all -> 0x045b }
            goto L_0x025a
        L_0x0253:
            java.lang.String r6 = "Width is too small or too large."
            int r7 = com.google.android.gms.ads.internal.util.zze.zza     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r6)     // Catch:{ all -> 0x045b }
        L_0x025a:
            if (r16 != 0) goto L_0x0263
            java.lang.String r0 = "Resize location out of screen or close button is not visible."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0263:
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ all -> 0x045b }
            int r6 = r1.zzh     // Catch:{ all -> 0x045b }
            int r6 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r4, r6)     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ all -> 0x045b }
            int r7 = r1.zze     // Catch:{ all -> 0x045b }
            int r7 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r4, r7)     // Catch:{ all -> 0x045b }
            r8 = r5
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x045b }
            android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x045b }
            boolean r9 = r8 instanceof android.view.ViewGroup     // Catch:{ all -> 0x045b }
            if (r9 == 0) goto L_0x0446
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ all -> 0x045b }
            r9 = r5
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x045b }
            r8.removeView(r9)     // Catch:{ all -> 0x045b }
            android.widget.PopupWindow r9 = r1.zzp     // Catch:{ all -> 0x045b }
            if (r9 != 0) goto L_0x02c1
            r1.zzr = r8     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            r8 = r5
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x045b }
            r8.setDrawingCacheEnabled(r10)     // Catch:{ all -> 0x045b }
            r8 = r5
            android.view.View r8 = (android.view.View) r8     // Catch:{ all -> 0x045b }
            android.graphics.Bitmap r8 = r8.getDrawingCache()     // Catch:{ all -> 0x045b }
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r8)     // Catch:{ all -> 0x045b }
            r9 = r5
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x045b }
            r11 = 0
            r9.setDrawingCacheEnabled(r11)     // Catch:{ all -> 0x045b }
            android.widget.ImageView r9 = new android.widget.ImageView     // Catch:{ all -> 0x045b }
            r9.<init>(r4)     // Catch:{ all -> 0x045b }
            r1.zzm = r9     // Catch:{ all -> 0x045b }
            r9.setImageBitmap(r8)     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzchd r8 = r5.zzO()     // Catch:{ all -> 0x045b }
            r1.zzl = r8     // Catch:{ all -> 0x045b }
            android.view.ViewGroup r8 = r1.zzr     // Catch:{ all -> 0x045b }
            android.widget.ImageView r9 = r1.zzm     // Catch:{ all -> 0x045b }
            r8.addView(r9)     // Catch:{ all -> 0x045b }
            goto L_0x02c4
        L_0x02c1:
            r9.dismiss()     // Catch:{ all -> 0x045b }
        L_0x02c4:
            android.widget.RelativeLayout r8 = new android.widget.RelativeLayout     // Catch:{ all -> 0x045b }
            r8.<init>(r4)     // Catch:{ all -> 0x045b }
            r1.zzq = r8     // Catch:{ all -> 0x045b }
            r9 = 0
            r8.setBackgroundColor(r9)     // Catch:{ all -> 0x045b }
            android.widget.RelativeLayout r8 = r1.zzq     // Catch:{ all -> 0x045b }
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams     // Catch:{ all -> 0x045b }
            r9.<init>(r6, r7)     // Catch:{ all -> 0x045b }
            r8.setLayoutParams(r9)     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            android.widget.RelativeLayout r8 = r1.zzq     // Catch:{ all -> 0x045b }
            android.widget.PopupWindow r9 = new android.widget.PopupWindow     // Catch:{ all -> 0x045b }
            r11 = 0
            r9.<init>(r8, r6, r7, r11)     // Catch:{ all -> 0x045b }
            r1.zzp = r9     // Catch:{ all -> 0x045b }
            r9.setOutsideTouchable(r11)     // Catch:{ all -> 0x045b }
            android.widget.PopupWindow r8 = r1.zzp     // Catch:{ all -> 0x045b }
            r8.setTouchable(r10)     // Catch:{ all -> 0x045b }
            android.widget.PopupWindow r8 = r1.zzp     // Catch:{ all -> 0x045b }
            boolean r9 = r1.zzb     // Catch:{ all -> 0x045b }
            r9 = r9 ^ r10
            r8.setClippingEnabled(r9)     // Catch:{ all -> 0x045b }
            android.widget.RelativeLayout r8 = r1.zzq     // Catch:{ all -> 0x045b }
            android.view.View r5 = (android.view.View) r5     // Catch:{ all -> 0x045b }
            r9 = -1
            r8.addView(r5, r9, r9)     // Catch:{ all -> 0x045b }
            android.widget.LinearLayout r5 = new android.widget.LinearLayout     // Catch:{ all -> 0x045b }
            r5.<init>(r4)     // Catch:{ all -> 0x045b }
            r1.zzn = r5     // Catch:{ all -> 0x045b }
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ all -> 0x045b }
            r8 = 50
            int r11 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r4, r8)     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ all -> 0x045b }
            int r8 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r4, r8)     // Catch:{ all -> 0x045b }
            r5.<init>(r11, r8)     // Catch:{ all -> 0x045b }
            java.lang.String r8 = r1.zza     // Catch:{ all -> 0x045b }
            int r11 = r8.hashCode()     // Catch:{ all -> 0x045b }
            switch(r11) {
                case -1364013995: goto L_0x0356;
                case -1012429441: goto L_0x034c;
                case -655373719: goto L_0x0342;
                case 1163912186: goto L_0x0338;
                case 1288627767: goto L_0x032e;
                case 1755462605: goto L_0x0324;
                default: goto L_0x0323;
            }
        L_0x0323:
            goto L_0x035f
        L_0x0324:
            java.lang.String r11 = "top-center"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x035f
            r9 = r10
            goto L_0x035f
        L_0x032e:
            java.lang.String r11 = "bottom-center"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x035f
            r9 = r13
            goto L_0x035f
        L_0x0338:
            java.lang.String r11 = "bottom-right"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x035f
            r9 = 5
            goto L_0x035f
        L_0x0342:
            java.lang.String r11 = "bottom-left"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x035f
            r9 = r14
            goto L_0x035f
        L_0x034c:
            java.lang.String r11 = "top-left"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x035f
            r9 = 0
            goto L_0x035f
        L_0x0356:
            java.lang.String r11 = "center"
            boolean r8 = r8.equals(r11)
            if (r8 == 0) goto L_0x035f
            r9 = r15
        L_0x035f:
            r8 = 9
            r11 = 10
            if (r9 == 0) goto L_0x039f
            r12 = 14
            if (r9 == r10) goto L_0x0398
            if (r9 == r15) goto L_0x0392
            r15 = 12
            if (r9 == r14) goto L_0x038b
            if (r9 == r13) goto L_0x0384
            r8 = 11
            r12 = 5
            if (r9 == r12) goto L_0x037d
            r5.addRule(r11)     // Catch:{ all -> 0x045b }
            r5.addRule(r8)     // Catch:{ all -> 0x045b }
            goto L_0x03a5
        L_0x037d:
            r5.addRule(r15)     // Catch:{ all -> 0x045b }
            r5.addRule(r8)     // Catch:{ all -> 0x045b }
            goto L_0x03a5
        L_0x0384:
            r5.addRule(r15)     // Catch:{ all -> 0x045b }
            r5.addRule(r12)     // Catch:{ all -> 0x045b }
            goto L_0x03a5
        L_0x038b:
            r5.addRule(r15)     // Catch:{ all -> 0x045b }
            r5.addRule(r8)     // Catch:{ all -> 0x045b }
            goto L_0x03a5
        L_0x0392:
            r8 = 13
            r5.addRule(r8)     // Catch:{ all -> 0x045b }
            goto L_0x03a5
        L_0x0398:
            r5.addRule(r11)     // Catch:{ all -> 0x045b }
            r5.addRule(r12)     // Catch:{ all -> 0x045b }
            goto L_0x03a5
        L_0x039f:
            r5.addRule(r11)     // Catch:{ all -> 0x045b }
            r5.addRule(r8)     // Catch:{ all -> 0x045b }
        L_0x03a5:
            android.widget.LinearLayout r8 = r1.zzn     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzbsn r9 = new com.google.android.gms.internal.ads.zzbsn     // Catch:{ all -> 0x045b }
            r9.<init>(r1)     // Catch:{ all -> 0x045b }
            r8.setOnClickListener(r9)     // Catch:{ all -> 0x045b }
            android.widget.LinearLayout r8 = r1.zzn     // Catch:{ all -> 0x045b }
            java.lang.String r9 = "Close button"
            r8.setContentDescription(r9)     // Catch:{ all -> 0x045b }
            android.widget.RelativeLayout r8 = r1.zzq     // Catch:{ all -> 0x045b }
            android.widget.LinearLayout r9 = r1.zzn     // Catch:{ all -> 0x045b }
            r8.addView(r9, r5)     // Catch:{ all -> 0x045b }
            android.widget.PopupWindow r5 = r1.zzp     // Catch:{ RuntimeException -> 0x0410 }
            android.view.View r0 = r0.getDecorView()     // Catch:{ RuntimeException -> 0x0410 }
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ RuntimeException -> 0x0410 }
            r8 = 0
            r9 = r16[r8]     // Catch:{ RuntimeException -> 0x0410 }
            int r9 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r4, r9)     // Catch:{ RuntimeException -> 0x0410 }
            com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch:{ RuntimeException -> 0x0410 }
            r11 = r16[r10]     // Catch:{ RuntimeException -> 0x0410 }
            int r4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(r4, r11)     // Catch:{ RuntimeException -> 0x0410 }
            r5.showAtLocation(r0, r8, r9, r4)     // Catch:{ RuntimeException -> 0x0410 }
            r0 = r16[r8]     // Catch:{ all -> 0x045b }
            r2 = r16[r10]     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzbsv r4 = r1.zzo     // Catch:{ all -> 0x045b }
            if (r4 == 0) goto L_0x03e8
            int r5 = r1.zzh     // Catch:{ all -> 0x045b }
            int r8 = r1.zze     // Catch:{ all -> 0x045b }
            r4.zza(r0, r2, r5, r8)     // Catch:{ all -> 0x045b }
        L_0x03e8:
            com.google.android.gms.internal.ads.zzcfg r0 = r1.zzj     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzchd r2 = com.google.android.gms.internal.ads.zzchd.zzb(r6, r7)     // Catch:{ all -> 0x045b }
            r0.zzaj(r2)     // Catch:{ all -> 0x045b }
            r0 = 0
            r2 = r16[r0]     // Catch:{ all -> 0x045b }
            r4 = r16[r10]     // Catch:{ all -> 0x045b }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ all -> 0x045b }
            android.app.Activity r5 = r1.zzk     // Catch:{ all -> 0x045b }
            int[] r5 = com.google.android.gms.ads.internal.util.zzs.zzS(r5)     // Catch:{ all -> 0x045b }
            r0 = r5[r0]     // Catch:{ all -> 0x045b }
            int r4 = r4 - r0
            int r0 = r1.zzh     // Catch:{ all -> 0x045b }
            int r5 = r1.zze     // Catch:{ all -> 0x045b }
            r1.zzk(r2, r4, r0, r5)     // Catch:{ all -> 0x045b }
            java.lang.String r0 = "resized"
            r1.zzl(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0410:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x045b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x045b }
            r4.<init>(r2)     // Catch:{ all -> 0x045b }
            r4.append(r0)     // Catch:{ all -> 0x045b }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x045b }
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            android.widget.RelativeLayout r0 = r1.zzq     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzcfg r2 = r1.zzj     // Catch:{ all -> 0x045b }
            r4 = r2
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x045b }
            r0.removeView(r4)     // Catch:{ all -> 0x045b }
            android.view.ViewGroup r0 = r1.zzr     // Catch:{ all -> 0x045b }
            if (r0 == 0) goto L_0x0444
            android.widget.ImageView r4 = r1.zzm     // Catch:{ all -> 0x045b }
            r0.removeView(r4)     // Catch:{ all -> 0x045b }
            android.view.ViewGroup r0 = r1.zzr     // Catch:{ all -> 0x045b }
            r4 = r2
            android.view.View r4 = (android.view.View) r4     // Catch:{ all -> 0x045b }
            r0.addView(r4)     // Catch:{ all -> 0x045b }
            com.google.android.gms.internal.ads.zzchd r0 = r1.zzl     // Catch:{ all -> 0x045b }
            r2.zzaj(r0)     // Catch:{ all -> 0x045b }
        L_0x0444:
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0446:
            java.lang.String r0 = "Webview is detached, probably in the middle of a resize or expand."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x044d:
            java.lang.String r0 = "Activity context is not ready, cannot get window or decor view."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x0454:
            java.lang.String r0 = "Invalid width and height options. Cannot resize."
            r1.zzh(r0)     // Catch:{ all -> 0x045b }
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            return
        L_0x045b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x045b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbso.zzc(java.util.Map):void");
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }
}
