package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdjt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final zzg zzb;
    private final zzfcw zzc;
    private final zzdiy zzd;
    private final zzdit zze;
    private final zzdkh zzf;
    private final zzdkp zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbge zzj;
    private final zzdiq zzk;

    public zzdjt(zzg zzg2, zzfcw zzfcw, zzdiy zzdiy, zzdit zzdit, zzdkh zzdkh, zzdkp zzdkp, Executor executor, Executor executor2, zzdiq zzdiq) {
        this.zzb = zzg2;
        this.zzc = zzfcw;
        this.zzj = zzfcw.zzi;
        this.zzd = zzdiy;
        this.zze = zzdit;
        this.zzf = zzdkh;
        this.zzg = zzdkp;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdiq;
    }

    public static /* synthetic */ void zza(zzdjt zzdjt, ViewGroup viewGroup) {
        zzdit zzdit = zzdjt.zze;
        if (zzdit.zzf() != null) {
            boolean z = viewGroup != null;
            if (zzdit.zzc() == 2 || zzdit.zzc() == 1) {
                zzdjt.zzb.zzF(zzdjt.zzc.zzf, String.valueOf(zzdit.zzc()), z);
            } else if (zzdit.zzc() == 6) {
                zzg zzg2 = zzdjt.zzb;
                String str = zzdjt.zzc.zzf;
                zzg2.zzF(str, "2", z);
                zzg2.zzF(str, "1", z);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ee A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzdjt r10, com.google.android.gms.internal.ads.zzdkr r11) {
        /*
            com.google.android.gms.internal.ads.zzdiy r0 = r10.zzd
            boolean r1 = r0.zzf()
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0014
            boolean r0 = r0.zze()
            if (r0 == 0) goto L_0x0012
            goto L_0x0014
        L_0x0012:
            r6 = r4
            goto L_0x0032
        L_0x0014:
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r5 = "1098"
            r1[r2] = r5
            java.lang.String r5 = "3011"
            r1[r3] = r5
            r5 = r2
        L_0x0020:
            if (r5 >= r0) goto L_0x0012
            r6 = r1[r5]
            android.view.View r6 = r11.zzg(r6)
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x002f
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L_0x0032
        L_0x002f:
            int r5 = r5 + 1
            goto L_0x0020
        L_0x0032:
            android.view.View r0 = r11.zzf()
            android.content.Context r0 = r0.getContext()
            android.widget.RelativeLayout$LayoutParams r1 = new android.widget.RelativeLayout$LayoutParams
            r5 = -2
            r1.<init>(r5, r5)
            com.google.android.gms.internal.ads.zzdit r5 = r10.zze
            android.view.View r7 = r5.zze()
            if (r7 == 0) goto L_0x005d
            android.view.View r0 = r5.zze()
            com.google.android.gms.internal.ads.zzbge r7 = r10.zzj
            if (r7 != 0) goto L_0x0051
            goto L_0x008c
        L_0x0051:
            if (r6 != 0) goto L_0x008c
            int r6 = r7.zze
            zzh(r1, r6)
            r0.setLayoutParams(r1)
            r6 = r4
            goto L_0x008c
        L_0x005d:
            com.google.android.gms.internal.ads.zzbgi r7 = r5.zzl()
            boolean r7 = r7 instanceof com.google.android.gms.internal.ads.zzbfz
            if (r7 != 0) goto L_0x0067
            r0 = r4
            goto L_0x008c
        L_0x0067:
            com.google.android.gms.internal.ads.zzbgi r7 = r5.zzl()
            com.google.android.gms.internal.ads.zzbfz r7 = (com.google.android.gms.internal.ads.zzbfz) r7
            if (r6 != 0) goto L_0x0077
            int r6 = r7.zzc()
            zzh(r1, r6)
            r6 = r4
        L_0x0077:
            com.google.android.gms.internal.ads.zzbga r8 = new com.google.android.gms.internal.ads.zzbga
            r8.<init>(r0, r7, r1)
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzed
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.setContentDescription(r0)
            r0 = r8
        L_0x008c:
            r1 = -1
            if (r0 != 0) goto L_0x0090
            goto L_0x00d2
        L_0x0090:
            android.view.ViewParent r7 = r0.getParent()
            boolean r7 = r7 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00a1
            android.view.ViewParent r7 = r0.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r0)
        L_0x00a1:
            if (r6 == 0) goto L_0x00aa
            r6.removeAllViews()
            r6.addView(r0)
            goto L_0x00cb
        L_0x00aa:
            com.google.android.gms.ads.formats.zza r6 = new com.google.android.gms.ads.formats.zza
            android.view.View r7 = r11.zzf()
            android.content.Context r7 = r7.getContext()
            r6.<init>(r7)
            android.widget.FrameLayout$LayoutParams r7 = new android.widget.FrameLayout$LayoutParams
            r7.<init>(r1, r1)
            r6.setLayoutParams(r7)
            r6.addView(r0)
            android.widget.FrameLayout r7 = r11.zzh()
            if (r7 == 0) goto L_0x00cb
            r7.addView(r6)
        L_0x00cb:
            java.lang.String r6 = r11.zzk()
            r11.zzq(r6, r0, r3)
        L_0x00d2:
            com.google.android.gms.internal.ads.zzfyq r0 = com.google.android.gms.internal.ads.zzdjp.zza
            int r6 = r0.size()
            r7 = r2
        L_0x00d9:
            if (r7 >= r6) goto L_0x00ee
            java.lang.Object r8 = r0.get(r7)
            java.lang.String r8 = (java.lang.String) r8
            android.view.View r8 = r11.zzg(r8)
            boolean r9 = r8 instanceof android.view.ViewGroup
            int r7 = r7 + 1
            if (r9 == 0) goto L_0x00d9
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L_0x00ef
        L_0x00ee:
            r8 = r4
        L_0x00ef:
            java.util.concurrent.Executor r0 = r10.zzi
            com.google.android.gms.internal.ads.zzdjq r6 = new com.google.android.gms.internal.ads.zzdjq
            r6.<init>(r10, r8)
            r0.execute(r6)
            if (r8 != 0) goto L_0x00fd
            goto L_0x01a9
        L_0x00fd:
            boolean r0 = r10.zzi(r8, r3)
            if (r0 == 0) goto L_0x0116
            com.google.android.gms.internal.ads.zzcfg r10 = r5.zzs()
            if (r10 == 0) goto L_0x01a9
            com.google.android.gms.internal.ads.zzcfg r10 = r5.zzs()
            com.google.android.gms.internal.ads.zzdjs r0 = new com.google.android.gms.internal.ads.zzdjs
            r0.<init>(r11, r8)
            r10.zzar(r0)
            return
        L_0x0116:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzkw
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r3.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0141
            boolean r0 = r10.zzi(r8, r2)
            if (r0 == 0) goto L_0x0141
            com.google.android.gms.internal.ads.zzcfg r10 = r5.zzq()
            if (r10 == 0) goto L_0x01a9
            com.google.android.gms.internal.ads.zzcfg r10 = r5.zzq()
            com.google.android.gms.internal.ads.zzdjs r0 = new com.google.android.gms.internal.ads.zzdjs
            r0.<init>(r11, r8)
            r10.zzar(r0)
            return
        L_0x0141:
            r8.removeAllViews()
            android.view.View r0 = r11.zzf()
            if (r0 == 0) goto L_0x014e
            android.content.Context r4 = r0.getContext()
        L_0x014e:
            if (r4 == 0) goto L_0x01a9
            com.google.android.gms.internal.ads.zzdiq r10 = r10.zzk
            com.google.android.gms.internal.ads.zzbgm r10 = r10.zza()
            if (r10 == 0) goto L_0x01a9
            com.google.android.gms.dynamic.IObjectWrapper r10 = r10.zzi()     // Catch:{ RemoteException -> 0x01a2 }
            if (r10 == 0) goto L_0x01a9
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.graphics.drawable.Drawable r10 = (android.graphics.drawable.Drawable) r10
            if (r10 == 0) goto L_0x01a9
            android.widget.ImageView r0 = new android.widget.ImageView
            r0.<init>(r4)
            r0.setImageDrawable(r10)
            com.google.android.gms.dynamic.IObjectWrapper r10 = r11.zzj()
            if (r10 == 0) goto L_0x0191
            com.google.android.gms.internal.ads.zzbcv r11 = com.google.android.gms.internal.ads.zzbde.zzgu
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r11 = r2.zzb(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L_0x0187
            goto L_0x0191
        L_0x0187:
            java.lang.Object r10 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r10)
            android.widget.ImageView$ScaleType r10 = (android.widget.ImageView.ScaleType) r10
            r0.setScaleType(r10)
            goto L_0x0196
        L_0x0191:
            android.widget.ImageView$ScaleType r10 = zza
            r0.setScaleType(r10)
        L_0x0196:
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r1, r1)
            r0.setLayoutParams(r10)
            r8.addView(r0)
            return
        L_0x01a2:
            int r10 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r10 = "Could not get main image drawable"
            com.google.android.gms.ads.internal.util.client.zzo.zzj(r10)
        L_0x01a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjt.zzb(com.google.android.gms.internal.ads.zzdjt, com.google.android.gms.internal.ads.zzdkr):void");
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        View zzf2 = z ? this.zze.zzf() : this.zze.zzg();
        if (zzf2 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf2.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf2.getParent()).removeView(zzf2);
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzef)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzf2, layoutParams);
        return true;
    }

    public final void zzc(zzdkr zzdkr) {
        zzdkh zzdkh;
        if (zzdkr != null && (zzdkh = this.zzf) != null && zzdkr.zzh() != null && this.zzd.zzg()) {
            try {
                zzdkr.zzh().addView(zzdkh.zza());
            } catch (zzcfs e) {
                zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zzd(zzdkr zzdkr) {
        if (zzdkr != null) {
            Context context = zzdkr.zzf().getContext();
            if (!zzbv.zzi(context, this.zzd.zza)) {
                return;
            }
            if (!(context instanceof Activity)) {
                int i = zze.zza;
                zzo.zze("Activity context is needed for policy validator.");
                return;
            }
            zzdkp zzdkp = this.zzg;
            if (zzdkp != null && zzdkr.zzh() != null) {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(zzdkp.zza(zzdkr.zzh(), windowManager), zzbv.zzb());
                } catch (zzcfs e) {
                    zze.zzb("web view can not be obtained", e);
                }
            }
        }
    }

    public final void zze(zzdkr zzdkr) {
        this.zzh.execute(new zzdjr(this, zzdkr));
    }

    public final boolean zzf(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }
}
