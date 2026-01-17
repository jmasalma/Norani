package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdo implements zzbkf {
    private static final Integer zzb(Map map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = "Precache invalid numeric parameter '" + str + "': " + ((String) map.get(str));
            int i = zze.zza;
            zzo.zzj(str2);
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcdn zzcdn;
        zzcdf zzcdf;
        Map map2 = map;
        zzccb zzccb = (zzccb) obj;
        if (zze.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map2);
            jSONObject.remove("google.afma.Notify_dt");
            zzo.zze("Precache GMSG: ".concat(jSONObject.toString()));
        }
        zzcdg zzA = zzv.zzA();
        if (!map2.containsKey("abort")) {
            String str = (String) map2.get("src");
            Integer zzb = zzb(map2, "periodicReportIntervalMs");
            Integer zzb2 = zzb(map2, "exoPlayerRenderingIntervalMs");
            Integer zzb3 = zzb(map2, "exoPlayerIdleIntervalMs");
            zzcca zzcca = new zzcca((String) map2.get("flags"));
            boolean z = zzcca.zzk;
            if (str != null) {
                String[] strArr = {str};
                String str2 = (String) map2.get("demuxed");
                if (str2 != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(str2);
                        String[] strArr2 = new String[jSONArray.length()];
                        for (int i = 0; i < jSONArray.length(); i++) {
                            strArr2[i] = jSONArray.getString(i);
                        }
                        strArr = strArr2;
                    } catch (JSONException unused) {
                        zzo.zzj("Malformed demuxed URL list for precache: ".concat(str2));
                        strArr = null;
                    }
                }
                if (strArr == null) {
                    strArr = new String[]{str};
                }
                if (z) {
                    Iterator it = zzA.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            zzcdf = null;
                            break;
                        }
                        zzcdf zzcdf2 = (zzcdf) it.next();
                        if (zzcdf2.zza == zzccb && str.equals(zzcdf2.zze())) {
                            zzcdf = zzcdf2;
                            break;
                        }
                    }
                } else {
                    zzcdf = zzA.zza(zzccb);
                }
                if (zzcdf != null) {
                    zzo.zzj("Precache task is already running.");
                    return;
                } else if (zzccb.zzj() == null) {
                    zzo.zzj("Precache requires a dependency provider.");
                    return;
                } else {
                    Integer zzb4 = zzb(map2, "player");
                    if (zzb4 == null) {
                        zzb4 = 0;
                    }
                    if (zzb != null) {
                        zzccb.zzA(zzb.intValue());
                    }
                    if (zzb2 != null) {
                        zzccb.zzy(zzb2.intValue());
                    }
                    if (zzb3 != null) {
                        zzccb.zzx(zzb3.intValue());
                    }
                    int intValue = zzb4.intValue();
                    zzccy zzccy = zzccb.zzj().zzb;
                    if (intValue > 0) {
                        int i2 = zzcca.zzg;
                        int zzu = zzcbs.zzu();
                        if (zzu < i2) {
                            zzcdn = new zzcdw(zzccb, zzcca);
                        } else {
                            if (((Boolean) zzbd.zzc().zzb(zzbde.zzp)).booleanValue()) {
                                zzu = zzcdt.zzi();
                            }
                            zzcdn = zzu < zzcca.zzb ? new zzcdt(zzccb, zzcca) : new zzcdr(zzccb);
                        }
                    } else {
                        zzcdn = new zzcdq(zzccb);
                    }
                    new zzcdf(zzccb, zzcdn, str, strArr).zzb();
                }
            } else {
                zzcdf zza = zzA.zza(zzccb);
                if (zza != null) {
                    zzcdn = zza.zzb;
                } else {
                    zzo.zzj("Precache must specify a source.");
                    return;
                }
            }
            Integer zzb5 = zzb(map2, "minBufferMs");
            if (zzb5 != null) {
                zzcdn.zzs(zzb5.intValue());
            }
            Integer zzb6 = zzb(map2, "maxBufferMs");
            if (zzb6 != null) {
                zzcdn.zzr(zzb6.intValue());
            }
            Integer zzb7 = zzb(map2, "bufferForPlaybackMs");
            if (zzb7 != null) {
                zzcdn.zzp(zzb7.intValue());
            }
            Integer zzb8 = zzb(map2, "bufferForPlaybackAfterRebufferMs");
            if (zzb8 != null) {
                zzcdn.zzq(zzb8.intValue());
            }
        } else if (!zzA.zzd(zzccb)) {
            zzo.zzj("Precache abort but no precache task running.");
        }
    }
}
