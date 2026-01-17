package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzdvh;
import com.google.android.gms.internal.ads.zzdvi;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzay {
    protected String zza = "";
    private final Object zzb = new Object();
    private String zzc = "";
    private String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    private zzdvi zzg;

    protected static final String zzo(Context context, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", zzv.zzr().zzc(context, str2));
        ListenableFuture zzb2 = new zzbo(context).zzb(0, str, hashMap, (byte[]) null);
        try {
            return (String) zzb2.get((long) ((Integer) zzbd.zzc().zzb(zzbde.zzfl)).intValue(), TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            String valueOf = String.valueOf(str);
            int i = zze.zza;
            zzo.zzh("Timeout while retrieving a response from: ".concat(valueOf), e);
            zzb2.cancel(true);
            return null;
        } catch (InterruptedException e2) {
            String valueOf2 = String.valueOf(str);
            int i2 = zze.zza;
            zzo.zzh("Interrupted while retrieving a response from: ".concat(valueOf2), e2);
            zzb2.cancel(true);
            return null;
        } catch (Exception e3) {
            String valueOf3 = String.valueOf(str);
            int i3 = zze.zza;
            zzo.zzh("Error retrieving a response from: ".concat(valueOf3), e3);
            return null;
        }
    }

    private final Uri zzp(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (TextUtils.isEmpty(this.zzc)) {
                zzv.zzr();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    int i = zze.zza;
                    zzo.zze("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (TextUtils.isEmpty(str5)) {
                    zzv.zzr();
                    this.zzc = UUID.randomUUID().toString();
                    zzv.zzr();
                    String str6 = this.zzc;
                    try {
                        FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes("UTF-8"));
                        openFileOutput.close();
                    } catch (Exception e) {
                        int i2 = zze.zza;
                        zzo.zzh("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final zzdvi zza() {
        return this.zzg;
    }

    public final String zzb() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzc(Context context) {
        zzdvi zzdvi;
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjE)).booleanValue() && (zzdvi = this.zzg) != null) {
            zzdvi.zzh(new zzav(this, context), zzdvh.zzd);
        }
    }

    public final void zzd(Context context, String str, String str2) {
        zzv.zzr();
        zzs.zzV(context, zzp(context, (String) zzbd.zzc().zzb(zzbde.zzfh), str, str2));
    }

    public final void zze(Context context, String str, String str2, String str3) {
        Uri.Builder buildUpon = zzp(context, (String) zzbd.zzc().zzb(zzbde.zzfk), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        zzv.zzr();
        zzs.zzM(context, str, buildUpon.build().toString());
    }

    public final void zzf(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjE)).booleanValue()) {
                zzv.zzp().zzi().zzx(z);
                zzdvi zzdvi = this.zzg;
                if (zzdvi != null) {
                    zzdvi.zzl(z);
                }
            }
        }
    }

    public final void zzg(zzdvi zzdvi) {
        this.zzg = zzdvi;
    }

    public final void zzh(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzi(Context context, String str, boolean z, boolean z2) {
        if (!(context instanceof Activity)) {
            int i = zze.zza;
            zzo.zzi("Can not create dialog without Activity Context");
            return;
        }
        zzs.zza.post(new zzax(this, context, str, z, z2));
    }

    public final boolean zzj(Context context, String str, String str2) {
        String zzo = zzo(context, zzp(context, (String) zzbd.zzc().zzb(zzbde.zzfj), str, str2).toString(), str2);
        if (TextUtils.isEmpty(zzo)) {
            int i = zze.zza;
            zzo.zze("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new JSONObject(zzo.trim()).optString("debug_mode"));
            zzf(equals);
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzjE)).booleanValue()) {
                zzg zzi = zzv.zzp().zzi();
                if (true != equals) {
                    str = "";
                }
                zzi.zzw(str);
            }
            return equals;
        } catch (JSONException e) {
            int i2 = zze.zza;
            zzo.zzk("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076 A[Catch:{ JSONException -> 0x0085 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzk(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzfi
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri r0 = r3.zzp(r4, r0, r5, r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = zzo(r4, r0, r6)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            r0 = 0
            if (r6 == 0) goto L_0x0027
            int r4 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r4 = "Not linked for in app preview."
            com.google.android.gms.ads.internal.util.client.zzo.zze(r4)
            return r0
        L_0x0027:
            java.lang.String r4 = r4.trim()
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0085 }
            r6.<init>(r4)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r4 = "gct"
            java.lang.String r4 = r6.optString(r4)     // Catch:{ JSONException -> 0x0085 }
            java.lang.String r1 = "status"
            java.lang.String r6 = r6.optString(r1)     // Catch:{ JSONException -> 0x0085 }
            r3.zza = r6     // Catch:{ JSONException -> 0x0085 }
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzjE     // Catch:{ JSONException -> 0x0085 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x0085 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0085 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0085 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0085 }
            r1 = 1
            if (r6 == 0) goto L_0x007b
            java.lang.String r6 = "0"
            java.lang.String r2 = r3.zza     // Catch:{ JSONException -> 0x0085 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r6 != 0) goto L_0x0068
            java.lang.String r6 = "2"
            java.lang.String r2 = r3.zza     // Catch:{ JSONException -> 0x0085 }
            boolean r6 = r6.equals(r2)     // Catch:{ JSONException -> 0x0085 }
            if (r6 == 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r6 = r0
            goto L_0x0069
        L_0x0068:
            r6 = r1
        L_0x0069:
            r3.zzf(r6)     // Catch:{ JSONException -> 0x0085 }
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch:{ JSONException -> 0x0085 }
            com.google.android.gms.ads.internal.util.zzg r2 = r2.zzi()     // Catch:{ JSONException -> 0x0085 }
            if (r6 != 0) goto L_0x0078
            java.lang.String r5 = ""
        L_0x0078:
            r2.zzw(r5)     // Catch:{ JSONException -> 0x0085 }
        L_0x007b:
            java.lang.Object r5 = r3.zzb
            monitor-enter(r5)
            r3.zzd = r4     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            return r1
        L_0x0082:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r4
        L_0x0085:
            r4 = move-exception
            int r5 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r5 = "Fail to get in app preview response json."
            com.google.android.gms.ads.internal.util.client.zzo.zzk(r5, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzay.zzk(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public final boolean zzl() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    public final boolean zzn(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i = zze.zza;
        zzo.zze("Sending troubleshooting signals to the server.");
        zze(context, str, str2, str3);
        return true;
    }
}
