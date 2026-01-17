package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdvd {
    private final zzdun zza;
    private final zzdpw zzb;
    private final Object zzc = new Object();
    private final List zzd;
    private boolean zze;

    zzdvd(zzdun zzdun, zzdpw zzdpw) {
        this.zza = zzdun;
        this.zzb = zzdpw;
        this.zzd = new ArrayList();
    }

    /* access modifiers changed from: private */
    public final void zzd(List list) {
        String str;
        boolean z;
        synchronized (this.zzc) {
            if (!this.zze) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    zzbmd zzbmd = (zzbmd) it.next();
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzjL)).booleanValue()) {
                        zzdpv zza2 = this.zzb.zza(zzbmd.zza);
                        if (zza2 != null) {
                            zzbse zzbse = zza2.zzc;
                            if (zzbse != null) {
                                str = zzbse.toString();
                            }
                        }
                        str = "";
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzjM)).booleanValue()) {
                        zzdpv zza3 = this.zzb.zza(zzbmd.zza);
                        if (zza3 != null) {
                            if (zza3.zzd) {
                                z = true;
                                List list2 = this.zzd;
                                String str3 = zzbmd.zza;
                                list2.add(new zzdvc(str3, str2, this.zzb.zzb(str3), zzbmd.zzb ? 1 : 0, zzbmd.zzd, zzbmd.zzc, z));
                            }
                        }
                    }
                    z = false;
                    List list22 = this.zzd;
                    String str32 = zzbmd.zza;
                    list22.add(new zzdvc(str32, str2, this.zzb.zzb(str32), zzbmd.zzb ? 1 : 0, zzbmd.zzd, zzbmd.zzc, z));
                }
                this.zze = true;
            }
        }
    }

    public final JSONArray zza() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.zzc) {
            if (!this.zze) {
                zzdun zzdun = this.zza;
                if (zzdun.zzt()) {
                    zzd(zzdun.zzg());
                } else {
                    zzc();
                }
            }
            for (zzdvc zza2 : this.zzd) {
                jSONArray.put(zza2.zza());
            }
        }
        return jSONArray;
    }

    public final void zzc() {
        this.zza.zzs(new zzdvb(this));
    }
}
