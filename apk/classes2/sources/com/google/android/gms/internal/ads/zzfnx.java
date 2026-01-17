package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfnx extends zzfnt {
    public zzfnx(zzfnm zzfnm, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnm, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfmi zza = zzfmi.zza();
        if (zza != null) {
            for (zzflp zzflp : zza.zzc()) {
                if (this.zza.contains(zzflp.zzh())) {
                    zzflp.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
