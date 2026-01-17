package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzejx extends zzbrr {
    private final String zza;
    private final zzbrp zzb;
    private final zzcak zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf = false;

    public zzejx(String str, zzbrp zzbrp, zzcak zzcak, long j) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzc = zzcak;
        this.zza = str;
        this.zzb = zzbrp;
        this.zze = j;
        try {
            jSONObject.put("adapter_version", zzbrp.zzf().toString());
            jSONObject.put("sdk_version", zzbrp.zzg().toString());
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzcak zzcak) {
        synchronized (zzejx.class) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                jSONObject.put("signal_error", "Adapter failed to instantiate");
                if (((Boolean) zzbd.zzc().zzb(zzbde.zzbM)).booleanValue()) {
                    jSONObject.put("signal_error_code", 1);
                }
                zzcak.zzc(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:6|7|(1:9)|10|(1:12)|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void zzh(java.lang.String r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzf     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            org.json.JSONObject r0 = r5.zzd     // Catch:{ JSONException -> 0x0047 }
            java.lang.String r1 = "signal_error"
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x0047 }
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzbN     // Catch:{ JSONException -> 0x0047 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x0047 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0047 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0047 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0047 }
            if (r6 == 0) goto L_0x0030
            java.lang.String r6 = "latency"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ JSONException -> 0x0047 }
            long r1 = r1.elapsedRealtime()     // Catch:{ JSONException -> 0x0047 }
            long r3 = r5.zze     // Catch:{ JSONException -> 0x0047 }
            long r1 = r1 - r3
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x0047 }
        L_0x0030:
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzbM     // Catch:{ JSONException -> 0x0047 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x0047 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0047 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0047 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0047 }
            if (r6 == 0) goto L_0x0047
            java.lang.String r6 = "signal_error_code"
            r0.put(r6, r7)     // Catch:{ JSONException -> 0x0047 }
        L_0x0047:
            com.google.android.gms.internal.ads.zzcak r6 = r5.zzc     // Catch:{ all -> 0x0053 }
            org.json.JSONObject r7 = r5.zzd     // Catch:{ all -> 0x0053 }
            r6.zzc(r7)     // Catch:{ all -> 0x0053 }
            r6 = 1
            r5.zzf = r6     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejx.zzh(java.lang.String, int):void");
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:6|7|(1:9)|10|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zzd() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.zzf     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            com.google.android.gms.internal.ads.zzbcv r0 = com.google.android.gms.internal.ads.zzbde.zzbM     // Catch:{ JSONException -> 0x0021 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x0021 }
            java.lang.Object r0 = r1.zzb(r0)     // Catch:{ JSONException -> 0x0021 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ JSONException -> 0x0021 }
            boolean r0 = r0.booleanValue()     // Catch:{ JSONException -> 0x0021 }
            if (r0 == 0) goto L_0x0021
            org.json.JSONObject r0 = r3.zzd     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r1 = "signal_error_code"
            r2 = 0
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x0021 }
        L_0x0021:
            com.google.android.gms.internal.ads.zzcak r0 = r3.zzc     // Catch:{ all -> 0x002d }
            org.json.JSONObject r1 = r3.zzd     // Catch:{ all -> 0x002d }
            r0.zzc(r1)     // Catch:{ all -> 0x002d }
            r0 = 1
            r3.zzf = r0     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejx.zzd():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:12|13|(1:15)|16|(1:18)|19|20|21|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void zze(java.lang.String r6) throws android.os.RemoteException {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.zzf     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r5)
            return
        L_0x0007:
            if (r6 != 0) goto L_0x0010
            java.lang.String r6 = "Adapter returned null signals"
            r5.zzf(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return
        L_0x0010:
            org.json.JSONObject r0 = r5.zzd     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r1 = "signals"
            r0.put(r1, r6)     // Catch:{ JSONException -> 0x0051 }
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzbN     // Catch:{ JSONException -> 0x0051 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x0051 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0051 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0051 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0051 }
            if (r6 == 0) goto L_0x0039
            java.lang.String r6 = "latency"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch:{ JSONException -> 0x0051 }
            long r1 = r1.elapsedRealtime()     // Catch:{ JSONException -> 0x0051 }
            long r3 = r5.zze     // Catch:{ JSONException -> 0x0051 }
            long r1 = r1 - r3
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x0051 }
        L_0x0039:
            com.google.android.gms.internal.ads.zzbcv r6 = com.google.android.gms.internal.ads.zzbde.zzbM     // Catch:{ JSONException -> 0x0051 }
            com.google.android.gms.internal.ads.zzbdc r1 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch:{ JSONException -> 0x0051 }
            java.lang.Object r6 = r1.zzb(r6)     // Catch:{ JSONException -> 0x0051 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0051 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0051 }
            if (r6 == 0) goto L_0x0051
            java.lang.String r6 = "signal_error_code"
            r1 = 0
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x0051 }
        L_0x0051:
            com.google.android.gms.internal.ads.zzcak r6 = r5.zzc     // Catch:{ all -> 0x005d }
            org.json.JSONObject r0 = r5.zzd     // Catch:{ all -> 0x005d }
            r6.zzc(r0)     // Catch:{ all -> 0x005d }
            r6 = 1
            r5.zzf = r6     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejx.zze(java.lang.String):void");
    }

    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    public final synchronized void zzg(zze zze2) throws RemoteException {
        zzh(zze2.zzb, 2);
    }
}
