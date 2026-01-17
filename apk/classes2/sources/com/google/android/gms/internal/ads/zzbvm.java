package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbvm extends zzbvk {
    private final Object zza = new Object();
    private final Context zzb;
    private SharedPreferences zzc;
    private final zzbom zzd;
    private final VersionInfoParcel zze;

    public zzbvm(Context context, zzbom zzbom, VersionInfoParcel versionInfoParcel) {
        this.zzb = context.getApplicationContext();
        this.zze = versionInfoParcel;
        this.zzd = zzbom;
    }

    public static /* synthetic */ Void zzb(zzbvm zzbvm, JSONObject jSONObject) {
        zzbcv zzbcv = zzbde.zza;
        zzbd.zzb();
        SharedPreferences zza2 = zzbcx.zza(zzbvm.zzb);
        if (zza2 == null) {
            return null;
        }
        SharedPreferences.Editor edit = zza2.edit();
        Objects.requireNonNull(zzbd.zza());
        int i = zzbeu.zza;
        zzbd.zza().zzf(edit, 1, jSONObject);
        zzbd.zzb();
        edit.commit();
        SharedPreferences sharedPreferences = zzbvm.zzc;
        if (sharedPreferences == null) {
            return null;
        }
        sharedPreferences.edit().putLong("js_last_update", zzv.zzD().currentTimeMillis()).apply();
        return null;
    }

    public static JSONObject zzc(Context context, VersionInfoParcel versionInfoParcel) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (((Boolean) zzbfe.zzb.zze()).booleanValue()) {
                jSONObject.put("package_name", context.getPackageName());
            }
            jSONObject.put("js", versionInfoParcel.afmaVersion);
            jSONObject.put("mf", zzbfe.zzc.zze());
            jSONObject.put("cl", "785558560");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 12451000);
            jSONObject.put("dynamite_local_version", 252530000);
            jSONObject.put("dynamite_version", DynamiteModule.getRemoteVersion(context, "com.google.android.gms.ads.dynamite"));
            jSONObject.put("container_version", 12451000);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final ListenableFuture zza() {
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = this.zzb.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        SharedPreferences sharedPreferences = this.zzc;
        long j = 0;
        if (sharedPreferences != null) {
            j = sharedPreferences.getLong("js_last_update", 0);
        }
        if (zzv.zzD().currentTimeMillis() - j < ((Long) zzbfe.zzd.zze()).longValue()) {
            return zzgdn.zzh((Object) null);
        }
        return zzgdn.zzm(this.zzd.zzb(zzc(this.zzb, this.zze)), new zzbvl(this), zzcaf.zzg);
    }
}
