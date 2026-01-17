package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzbcw {
    private final List zza = new ArrayList();
    private final List zzb = new ArrayList();
    private final List zzc = new ArrayList();

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (zzbcv zzb2 : this.zzb) {
            String str = (String) zzbd.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(zzbdf.zza());
        return arrayList;
    }

    public final List zzb() {
        List zza2 = zza();
        for (zzbcv zzb2 : this.zzc) {
            String str = (String) zzbd.zzc().zzb(zzb2);
            if (!TextUtils.isEmpty(str)) {
                zza2.add(str);
            }
        }
        zza2.addAll(zzbdf.zzb());
        return zza2;
    }

    public final void zzc(zzbcv zzbcv) {
        this.zzb.add(zzbcv);
    }

    public final void zzd(zzbcv zzbcv) {
        this.zza.add(zzbcv);
    }

    public final void zze(zzbcv zzbcv) {
        this.zzc.add(zzbcv);
    }

    public final void zzf(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (zzbcv zzbcv : this.zza) {
            if (zzbcv.zze() == 1) {
                zzbcv.zzd(editor, zzbcv.zza(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            zzo.zzg("Flag Json is null.");
        }
    }
}
