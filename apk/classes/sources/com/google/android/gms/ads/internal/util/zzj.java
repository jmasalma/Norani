package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbac;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbev;
import com.google.android.gms.internal.ads.zzbew;
import com.google.android.gms.internal.ads.zzbzm;
import com.google.android.gms.internal.ads.zzcaf;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzj implements zzg {
    private String zzA = "{}";
    private int zzB = -1;
    private int zzC = -1;
    private long zzD = 0;
    private final Object zza = new Object();
    private boolean zzb;
    private final List zzc = new ArrayList();
    private ListenableFuture zzd;
    private zzbac zze = null;
    private SharedPreferences zzf;
    private SharedPreferences.Editor zzg;
    private boolean zzh = true;
    private String zzi;
    private String zzj;
    private boolean zzk = true;
    private String zzl = "-1";
    private int zzm = -1;
    private zzbzm zzn = new zzbzm("", 0);
    private long zzo = 0;
    private long zzp = 0;
    private int zzq = -1;
    private int zzr = 0;
    private Set zzs = Collections.emptySet();
    private JSONObject zzt = new JSONObject();
    private boolean zzu = true;
    private boolean zzv = true;
    private String zzw = null;
    private String zzx = "";
    private boolean zzy = false;
    private String zzz = "";

    public static /* synthetic */ void zzQ(zzj zzj2, Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (zzj2.zza) {
                zzj2.zzf = sharedPreferences;
                zzj2.zzg = edit;
                if (PlatformVersion.isAtLeastM()) {
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                }
                zzj2.zzh = zzj2.zzf.getBoolean("use_https", zzj2.zzh);
                zzj2.zzu = zzj2.zzf.getBoolean("content_url_opted_out", zzj2.zzu);
                zzj2.zzi = zzj2.zzf.getString("content_url_hashes", zzj2.zzi);
                zzj2.zzk = zzj2.zzf.getBoolean("gad_idless", zzj2.zzk);
                zzj2.zzv = zzj2.zzf.getBoolean("content_vertical_opted_out", zzj2.zzv);
                zzj2.zzj = zzj2.zzf.getString("content_vertical_hashes", zzj2.zzj);
                zzj2.zzr = zzj2.zzf.getInt("version_code", zzj2.zzr);
                if (!((Boolean) zzbew.zzg.zze()).booleanValue() || !zzbd.zzc().zze()) {
                    zzj2.zzn = new zzbzm(zzj2.zzf.getString("app_settings_json", zzj2.zzn.zzc()), zzj2.zzf.getLong("app_settings_last_update_ms", zzj2.zzn.zza()));
                } else {
                    zzj2.zzn = new zzbzm("", 0);
                }
                zzj2.zzo = zzj2.zzf.getLong("app_last_background_time_ms", zzj2.zzo);
                zzj2.zzq = zzj2.zzf.getInt("request_in_session_count", zzj2.zzq);
                zzj2.zzp = zzj2.zzf.getLong("first_ad_req_time_ms", zzj2.zzp);
                zzj2.zzs = zzj2.zzf.getStringSet("never_pool_slots", zzj2.zzs);
                zzj2.zzw = zzj2.zzf.getString("display_cutout", zzj2.zzw);
                zzj2.zzB = zzj2.zzf.getInt("app_measurement_npa", zzj2.zzB);
                zzj2.zzC = zzj2.zzf.getInt("sd_app_measure_npa", zzj2.zzC);
                zzj2.zzD = zzj2.zzf.getLong("sd_app_measure_npa_ts", zzj2.zzD);
                zzj2.zzx = zzj2.zzf.getString("inspector_info", zzj2.zzx);
                zzj2.zzy = zzj2.zzf.getBoolean("linked_device", zzj2.zzy);
                zzj2.zzz = zzj2.zzf.getString("linked_ad_unit", zzj2.zzz);
                zzj2.zzA = zzj2.zzf.getString("inspector_ui_storage", zzj2.zzA);
                zzj2.zzl = zzj2.zzf.getString("IABTCF_TCString", zzj2.zzl);
                zzj2.zzm = zzj2.zzf.getInt("gad_has_consent_for_cookies", zzj2.zzm);
                try {
                    zzj2.zzt = new JSONObject(zzj2.zzf.getString("native_advanced_settings", "{}"));
                } catch (JSONException e) {
                    int i = zze.zza;
                    zzo.zzk("Could not convert native advanced settings to json object", e);
                }
                zzj2.zzS();
            }
        } catch (Throwable th) {
            zzv.zzp().zzw(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            zze.zzb("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    private final void zzR() {
        ListenableFuture listenableFuture = this.zzd;
        if (listenableFuture != null && !listenableFuture.isDone()) {
            try {
                this.zzd.get(1, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                int i = zze.zza;
                zzo.zzk("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException | ExecutionException | TimeoutException e2) {
                int i2 = zze.zza;
                zzo.zzh("Fail to initialize AdSharedPreferenceManager.", e2);
            }
        }
    }

    private final void zzS() {
        zzcaf.zza.execute(new zzh(this));
    }

    public final void zzA(int i) {
        zzR();
        synchronized (this.zza) {
            this.zzm = i;
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                if (i == -1) {
                    editor.remove("gad_has_consent_for_cookies");
                } else {
                    editor.putInt("gad_has_consent_for_cookies", i);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    public final void zzB(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjp)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (!this.zzx.equals(str)) {
                    this.zzx = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.zzg.apply();
                    }
                    zzS();
                }
            }
        }
    }

    public final void zzC(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjS)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (!this.zzA.equals(str)) {
                    this.zzA = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.zzg.apply();
                    }
                    zzS();
                }
            }
        }
    }

    public final void zzD(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (z != this.zzk) {
                this.zzk = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzE(boolean z) {
        zzR();
        synchronized (this.zza) {
            long currentTimeMillis = System.currentTimeMillis() + ((Long) zzbd.zzc().zzb(zzbde.zzkT)).longValue();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putBoolean("is_topics_ad_personalization_allowed", z);
                this.zzg.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                this.zzg.apply();
            }
            zzS();
        }
    }

    public final void zzF(String str, String str2, boolean z) {
        zzR();
        synchronized (this.zza) {
            JSONArray optJSONArray = this.zzt.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i < optJSONArray.length()) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        if (!str2.equals(optJSONObject.optString("template_id"))) {
                            i++;
                        } else if (!z || !optJSONObject.optBoolean("uses_media_view", false)) {
                            length = i;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", zzv.zzD().currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.zzt.put(str, optJSONArray);
            } catch (JSONException e) {
                int i2 = zze.zza;
                zzo.zzk("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.zzt.toString());
                this.zzg.apply();
            }
            zzS();
        }
    }

    public final void zzG(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzq != i) {
                this.zzq = i;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzH(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzC != i) {
                this.zzC = i;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzI(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzD != j) {
                this.zzD = j;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzJ(String str) {
        zzR();
        synchronized (this.zza) {
            this.zzl = str;
            if (this.zzg != null) {
                if (str.equals("-1")) {
                    this.zzg.remove("IABTCF_TCString");
                } else {
                    this.zzg.putString("IABTCF_TCString", str);
                }
                this.zzg.apply();
            }
            zzS();
        }
    }

    public final boolean zzK() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzu;
        }
        return z;
    }

    public final boolean zzL() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzv;
        }
        return z;
    }

    public final boolean zzM() {
        boolean z;
        zzR();
        synchronized (this.zza) {
            z = this.zzy;
        }
        return z;
    }

    public final boolean zzN() {
        boolean z;
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzaL)).booleanValue()) {
            return false;
        }
        zzR();
        synchronized (this.zza) {
            z = this.zzk;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzO() {
        /*
            r7 = this;
            r7.zzR()
            java.lang.Object r0 = r7.zza
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r7.zzf     // Catch:{ all -> 0x0030 }
            r2 = 0
            if (r1 != 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x000d:
            java.lang.String r3 = "topics_consent_expiry_time_ms"
            r4 = 0
            long r3 = r1.getLong(r3, r4)     // Catch:{ all -> 0x0030 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0030 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x001f
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x001f:
            android.content.SharedPreferences r1 = r7.zzf     // Catch:{ all -> 0x0030 }
            java.lang.String r3 = "is_topics_ad_personalization_allowed"
            boolean r1 = r1.getBoolean(r3, r2)     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            boolean r1 = r7.zzk     // Catch:{ all -> 0x0030 }
            if (r1 != 0) goto L_0x002e
            r2 = 1
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return r2
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzj.zzO():boolean");
    }

    public final zzbac zzP() {
        if (!this.zzb) {
            return null;
        }
        if ((zzK() && zzL()) || !((Boolean) zzbev.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.zza) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.zze == null) {
                this.zze = new zzbac();
            }
            this.zze.zzd();
            int i = zze.zza;
            zzo.zzi("start fetching content...");
            zzbac zzbac = this.zze;
            return zzbac;
        }
    }

    public final int zza() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzr;
        }
        return i;
    }

    public final int zzb() {
        zzR();
        return this.zzm;
    }

    public final int zzc() {
        int i;
        zzR();
        synchronized (this.zza) {
            i = this.zzq;
        }
        return i;
    }

    public final long zzd() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzo;
        }
        return j;
    }

    public final long zze() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzp;
        }
        return j;
    }

    public final long zzf() {
        long j;
        zzR();
        synchronized (this.zza) {
            j = this.zzD;
        }
        return j;
    }

    public final zzbzm zzg() {
        zzbzm zzbzm;
        zzR();
        synchronized (this.zza) {
            if (((Boolean) zzbd.zzc().zzb(zzbde.zzmd)).booleanValue() && this.zzn.zzj()) {
                for (Runnable run : this.zzc) {
                    run.run();
                }
            }
            zzbzm = this.zzn;
        }
        return zzbzm;
    }

    public final zzbzm zzh() {
        zzbzm zzbzm;
        synchronized (this.zza) {
            zzbzm = this.zzn;
        }
        return zzbzm;
    }

    public final String zzi() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzz;
        }
        return str;
    }

    public final String zzj() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzw;
        }
        return str;
    }

    public final String zzk() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzx;
        }
        return str;
    }

    public final String zzl() {
        String str;
        zzR();
        synchronized (this.zza) {
            str = this.zzA;
        }
        return str;
    }

    public final String zzm() {
        zzR();
        return this.zzl;
    }

    public final JSONObject zzn() {
        JSONObject jSONObject;
        zzR();
        synchronized (this.zza) {
            jSONObject = this.zzt;
        }
        return jSONObject;
    }

    public final void zzo(Runnable runnable) {
        this.zzc.add(runnable);
    }

    public final void zzp(Context context) {
        synchronized (this.zza) {
            if (this.zzf == null) {
                this.zzd = zzcaf.zza.zza(new zzi(this, context, "admob"));
                this.zzb = true;
            }
        }
    }

    public final void zzq() {
        zzR();
        synchronized (this.zza) {
            this.zzt = new JSONObject();
            SharedPreferences.Editor editor = this.zzg;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.zzg.apply();
            }
            zzS();
        }
    }

    public final void zzr(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzo != j) {
                this.zzo = j;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzs(String str) {
        zzR();
        synchronized (this.zza) {
            long currentTimeMillis = zzv.zzD().currentTimeMillis();
            if (str != null) {
                if (!str.equals(this.zzn.zzc())) {
                    this.zzn = new zzbzm(str, currentTimeMillis);
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.zzg.putLong("app_settings_last_update_ms", currentTimeMillis);
                        this.zzg.apply();
                    }
                    zzS();
                    for (Runnable run : this.zzc) {
                        run.run();
                    }
                    return;
                }
            }
            this.zzn.zzg(currentTimeMillis);
        }
    }

    public final void zzt(int i) {
        zzR();
        synchronized (this.zza) {
            if (this.zzr != i) {
                this.zzr = i;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzu(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzu != z) {
                this.zzu = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzv(boolean z) {
        zzR();
        synchronized (this.zza) {
            if (this.zzv != z) {
                this.zzv = z;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzw(String str) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjE)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (!this.zzz.equals(str)) {
                    this.zzz = str;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.zzg.apply();
                    }
                    zzS();
                }
            }
        }
    }

    public final void zzx(boolean z) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzjE)).booleanValue()) {
            zzR();
            synchronized (this.zza) {
                if (this.zzy != z) {
                    this.zzy = z;
                    SharedPreferences.Editor editor = this.zzg;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.zzg.apply();
                    }
                    zzS();
                }
            }
        }
    }

    public final void zzy(String str) {
        zzR();
        synchronized (this.zza) {
            if (!TextUtils.equals(this.zzw, str)) {
                this.zzw = str;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }

    public final void zzz(long j) {
        zzR();
        synchronized (this.zza) {
            if (this.zzp != j) {
                this.zzp = j;
                SharedPreferences.Editor editor = this.zzg;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.zzg.apply();
                }
                zzS();
            }
        }
    }
}
