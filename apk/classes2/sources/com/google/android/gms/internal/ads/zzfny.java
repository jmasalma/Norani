package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfny extends zzfnt {
    public zzfny(zzfnm zzfnm, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnm, hashSet, jSONObject, j);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        zzfnm zzfnm = this.zzd;
        JSONObject jSONObject = this.zzb;
        if (zzfne.zzg(jSONObject, zzfnm.zza())) {
            return null;
        }
        zzfnm.zze(jSONObject);
        return jSONObject.toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzfmi zza;
        if (!TextUtils.isEmpty(str) && (zza = zzfmi.zza()) != null) {
            for (zzflp zzflp : zza.zzc()) {
                if (this.zza.contains(zzflp.zzh())) {
                    zzflp.zzg().zzh(str, this.zzc);
                }
            }
        }
        super.onPostExecute(str);
    }
}
