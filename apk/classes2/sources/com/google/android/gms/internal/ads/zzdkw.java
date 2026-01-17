package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzdf;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
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
public final class zzdkw implements zzdjb, zzdax {
    private final zzbqf zza;
    private final zzcwq zzb;
    private final zzcym zzc;
    private final zzcvw zzd;
    private final zzdeb zze;
    private final Context zzf;
    private final zzfca zzg;
    private final VersionInfoParcel zzh;
    private final zzfcw zzi;
    private boolean zzj = false;
    private boolean zzk = false;
    private boolean zzl = true;
    private final zzbqb zzm;
    private final zzbqc zzn;

    public zzdkw(zzbqb zzbqb, zzbqc zzbqc, zzbqf zzbqf, zzcwq zzcwq, zzcym zzcym, zzcvw zzcvw, zzdeb zzdeb, Context context, zzfca zzfca, VersionInfoParcel versionInfoParcel, zzfcw zzfcw) {
        this.zzm = zzbqb;
        this.zzn = zzbqc;
        this.zza = zzbqf;
        this.zzb = zzcwq;
        this.zzc = zzcym;
        this.zzd = zzcvw;
        this.zze = zzdeb;
        this.zzf = context;
        this.zzg = zzfca;
        this.zzh = versionInfoParcel;
        this.zzi = zzfcw;
    }

    private final void zzc(View view) {
        try {
            zzbqf zzbqf = this.zza;
            if (zzbqf == null || zzbqf.zzA()) {
                zzbqb zzbqb = this.zzm;
                if (zzbqb == null || zzbqb.zzx()) {
                    zzbqc zzbqc = this.zzn;
                    if (zzbqc != null && !zzbqc.zzv()) {
                        zzbqc.zzq(ObjectWrapper.wrap(view));
                        this.zzd.onAdClicked();
                        if (((Boolean) zzbd.zzc().zzb(zzbde.zzli)).booleanValue()) {
                            this.zze.zzdf();
                            return;
                        }
                        return;
                    }
                    return;
                }
                zzbqb.zzs(ObjectWrapper.wrap(view));
                this.zzd.onAdClicked();
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzli)).booleanValue()) {
                    this.zze.zzdf();
                    return;
                }
                return;
            }
            zzbqf.zzw(ObjectWrapper.wrap(view));
            this.zzd.onAdClicked();
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzli)).booleanValue()) {
                this.zze.zzdf();
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to call handleClick", e);
        }
    }

    private static final HashMap zzd(Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            synchronized (map) {
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) ((WeakReference) entry.getValue()).get();
                    if (view != null) {
                        hashMap.put((String) entry.getKey(), view);
                    }
                }
            }
        }
        return hashMap;
    }

    public final void zzA(zzbig zzbig) {
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzB(android.view.View r9, java.util.Map r10, java.util.Map r11, android.view.View.OnTouchListener r12, android.view.View.OnClickListener r13) {
        /*
            r8 = this;
            com.google.android.gms.dynamic.IObjectWrapper r9 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r9)     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.internal.ads.zzfca r12 = r8.zzg     // Catch:{ RemoteException -> 0x011e }
            org.json.JSONObject r12 = r12.zzaj     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.internal.ads.zzbcv r13 = com.google.android.gms.internal.ads.zzbde.zzbJ     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.internal.ads.zzbdc r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ RemoteException -> 0x011e }
            java.lang.Object r13 = r0.zzb(r13)     // Catch:{ RemoteException -> 0x011e }
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ RemoteException -> 0x011e }
            boolean r13 = r13.booleanValue()     // Catch:{ RemoteException -> 0x011e }
            r0 = 1
            if (r13 == 0) goto L_0x00de
            int r13 = r12.length()     // Catch:{ RemoteException -> 0x011e }
            if (r13 != 0) goto L_0x0023
            goto L_0x00de
        L_0x0023:
            if (r10 != 0) goto L_0x002b
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ RemoteException -> 0x011e }
            r13.<init>()     // Catch:{ RemoteException -> 0x011e }
            goto L_0x002c
        L_0x002b:
            r13 = r10
        L_0x002c:
            if (r11 != 0) goto L_0x0034
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ RemoteException -> 0x011e }
            r1.<init>()     // Catch:{ RemoteException -> 0x011e }
            goto L_0x0035
        L_0x0034:
            r1 = r11
        L_0x0035:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ RemoteException -> 0x011e }
            r2.<init>()     // Catch:{ RemoteException -> 0x011e }
            r2.putAll(r13)     // Catch:{ RemoteException -> 0x011e }
            r2.putAll(r1)     // Catch:{ RemoteException -> 0x011e }
            java.util.Iterator r13 = r12.keys()     // Catch:{ RemoteException -> 0x011e }
        L_0x0044:
            boolean r1 = r13.hasNext()     // Catch:{ RemoteException -> 0x011e }
            if (r1 == 0) goto L_0x00de
            java.lang.Object r1 = r13.next()     // Catch:{ RemoteException -> 0x011e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ RemoteException -> 0x011e }
            org.json.JSONArray r3 = r12.optJSONArray(r1)     // Catch:{ RemoteException -> 0x011e }
            if (r3 == 0) goto L_0x0044
            java.lang.Object r4 = r2.get(r1)     // Catch:{ RemoteException -> 0x011e }
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4     // Catch:{ RemoteException -> 0x011e }
            r5 = 0
            if (r4 != 0) goto L_0x0062
        L_0x005f:
            r0 = r5
            goto L_0x00de
        L_0x0062:
            java.lang.Object r4 = r4.get()     // Catch:{ RemoteException -> 0x011e }
            if (r4 != 0) goto L_0x0069
            goto L_0x005f
        L_0x0069:
            java.lang.Class r4 = r4.getClass()     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzbK     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.internal.ads.zzbdc r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ RemoteException -> 0x011e }
            java.lang.Object r6 = r7.zzb(r6)     // Catch:{ RemoteException -> 0x011e }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ RemoteException -> 0x011e }
            boolean r6 = r6.booleanValue()     // Catch:{ RemoteException -> 0x011e }
            if (r6 == 0) goto L_0x00b1
            java.lang.String r6 = "3010"
            boolean r1 = r1.equals(r6)     // Catch:{ RemoteException -> 0x011e }
            if (r1 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzbqf r1 = r8.zza     // Catch:{ RemoteException -> 0x011e }
            r4 = 0
            if (r1 == 0) goto L_0x0091
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzn()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x0091:
            com.google.android.gms.internal.ads.zzbqb r1 = r8.zzm     // Catch:{ RemoteException -> 0x011e }
            if (r1 == 0) goto L_0x009a
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzk()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x009a:
            com.google.android.gms.internal.ads.zzbqc r1 = r8.zzn     // Catch:{ RemoteException -> 0x011e }
            if (r1 == 0) goto L_0x00a3
            com.google.android.gms.dynamic.IObjectWrapper r1 = r1.zzj()     // Catch:{ RemoteException -> 0x00aa }
            goto L_0x00a4
        L_0x00a3:
            r1 = r4
        L_0x00a4:
            if (r1 == 0) goto L_0x00aa
            java.lang.Object r4 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)     // Catch:{  }
        L_0x00aa:
            if (r4 != 0) goto L_0x00ad
            goto L_0x005f
        L_0x00ad:
            java.lang.Class r4 = r4.getClass()     // Catch:{ RemoteException -> 0x011e }
        L_0x00b1:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0044 }
            r1.<init>()     // Catch:{ JSONException -> 0x0044 }
            com.google.android.gms.ads.internal.util.zzbs.zzc(r3, r1)     // Catch:{ JSONException -> 0x0044 }
            com.google.android.gms.ads.internal.zzv.zzr()     // Catch:{ JSONException -> 0x0044 }
            android.content.Context r3 = r8.zzf     // Catch:{ JSONException -> 0x0044 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ JSONException -> 0x0044 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ JSONException -> 0x0044 }
        L_0x00c6:
            boolean r6 = r1.hasNext()     // Catch:{ JSONException -> 0x0044 }
            if (r6 == 0) goto L_0x005f
            java.lang.Object r6 = r1.next()     // Catch:{ JSONException -> 0x0044 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ JSONException -> 0x0044 }
            java.lang.Class r6 = java.lang.Class.forName(r6, r5, r3)     // Catch:{ all -> 0x00c6 }
            boolean r6 = r6.isAssignableFrom(r4)     // Catch:{ all -> 0x00c6 }
            if (r6 == 0) goto L_0x00c6
            goto L_0x0044
        L_0x00de:
            r8.zzl = r0     // Catch:{ RemoteException -> 0x011e }
            java.util.HashMap r10 = zzd(r10)     // Catch:{ RemoteException -> 0x011e }
            java.util.HashMap r11 = zzd(r11)     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.internal.ads.zzbqf r12 = r8.zza     // Catch:{ RemoteException -> 0x011e }
            if (r12 == 0) goto L_0x00f8
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x011e }
            r12.zzy(r9, r10, r11)     // Catch:{ RemoteException -> 0x011e }
            return
        L_0x00f8:
            com.google.android.gms.internal.ads.zzbqb r12 = r8.zzm     // Catch:{ RemoteException -> 0x011e }
            if (r12 == 0) goto L_0x010b
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x011e }
            r12.zzv(r9, r10, r11)     // Catch:{ RemoteException -> 0x011e }
            r12.zzu(r9)     // Catch:{ RemoteException -> 0x011e }
            return
        L_0x010b:
            com.google.android.gms.internal.ads.zzbqc r12 = r8.zzn     // Catch:{ RemoteException -> 0x011e }
            if (r12 == 0) goto L_0x011d
            com.google.android.gms.dynamic.IObjectWrapper r10 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)     // Catch:{ RemoteException -> 0x011e }
            com.google.android.gms.dynamic.IObjectWrapper r11 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r11)     // Catch:{ RemoteException -> 0x011e }
            r12.zzt(r9, r10, r11)     // Catch:{ RemoteException -> 0x011e }
            r12.zzs(r9)     // Catch:{ RemoteException -> 0x011e }
        L_0x011d:
            return
        L_0x011e:
            r9 = move-exception
            int r10 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r10 = "Failed to call trackView"
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r10, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdkw.zzB(android.view.View, java.util.Map, java.util.Map, android.view.View$OnTouchListener, android.view.View$OnClickListener):void");
    }

    public final void zzC(View view, Map map) {
        try {
            IObjectWrapper wrap = ObjectWrapper.wrap(view);
            zzbqf zzbqf = this.zza;
            if (zzbqf != null) {
                zzbqf.zzz(wrap);
                return;
            }
            zzbqb zzbqb = this.zzm;
            if (zzbqb != null) {
                zzbqb.zzw(wrap);
                return;
            }
            zzbqc zzbqc = this.zzn;
            if (zzbqc != null) {
                zzbqc.zzu(wrap);
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to call untrackView", e);
        }
    }

    public final boolean zzD() {
        return true;
    }

    public final boolean zzE() {
        return this.zzg.zzL;
    }

    public final boolean zzF(Bundle bundle) {
        return false;
    }

    public final int zza() {
        return 0;
    }

    public final void zzdp() {
    }

    public final void zzdq() {
        try {
            zzbqf zzbqf = this.zza;
            if (zzbqf != null && zzbqf.zzB()) {
                zzfca zzfca = this.zzg;
                if (zzfca.zze == 4 || zzfca.zzaC) {
                    zzbqf.zzx();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to report impression from an adapter", e);
        }
    }

    public final JSONObject zzf(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final JSONObject zzg(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        return null;
    }

    public final void zzi() {
        int i = zze.zza;
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzj() {
    }

    public final void zzk() {
    }

    public final void zzl(zzdj zzdj) {
        int i = zze.zza;
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }

    public final void zzm(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType) {
        if (!this.zzk || !this.zzg.zzL) {
            zzc(view);
        }
    }

    public final void zzn(String str) {
    }

    public final void zzo(Bundle bundle) {
    }

    public final void zzq(View view, View view2, Map map, Map map2, boolean z, ImageView.ScaleType scaleType, int i) {
        if (!this.zzk) {
            int i2 = zze.zza;
            zzo.zzj("Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.");
        } else if (!this.zzg.zzL) {
            int i3 = zze.zza;
            zzo.zzj("Custom click reporting for 3p ads failed. Ad unit id not in allow list.");
        } else {
            zzc(view2);
        }
    }

    public final void zzr(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
    }

    public final void zzs() {
    }

    public final void zzt(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        try {
            if (!this.zzj) {
                this.zzj = zzv.zzu().zzn(this.zzf, this.zzh.afmaVersion, this.zzg.zzC.toString(), this.zzi.zzf);
            }
            if (this.zzl) {
                zzbqf zzbqf = this.zza;
                if (zzbqf != null) {
                    zzfca zzfca = this.zzg;
                    if (zzfca.zzaC) {
                        if (!zzbqf.zzB()) {
                            zzbqf.zzx();
                            this.zzb.zza();
                        }
                    } else if (!zzbqf.zzB() || zzfca.zze != 4) {
                        zzbqf.zzx();
                        this.zzb.zza();
                    } else {
                        this.zzc.zza();
                    }
                } else {
                    zzbqb zzbqb = this.zzm;
                    if (zzbqb == null || zzbqb.zzy()) {
                        zzbqc zzbqc = this.zzn;
                        if (zzbqc != null && !zzbqc.zzw()) {
                            zzbqc.zzr();
                            this.zzb.zza();
                            return;
                        }
                        return;
                    }
                    zzbqb.zzt();
                    this.zzb.zza();
                }
            }
        } catch (RemoteException e) {
            int i = zze.zza;
            zzo.zzk("Failed to call recordImpression", e);
        }
    }

    public final void zzu() {
    }

    public final void zzv(View view, MotionEvent motionEvent, View view2) {
    }

    public final void zzw(Bundle bundle) {
    }

    public final void zzx(View view) {
    }

    public final void zzy() {
        this.zzk = true;
    }

    public final void zzz(zzdf zzdf) {
        int i = zze.zza;
        zzo.zzj("Mute This Ad is not supported for 3rd party ads");
    }
}
