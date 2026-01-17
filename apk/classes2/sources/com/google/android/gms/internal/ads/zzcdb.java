package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcj;
import com.google.android.gms.ads.internal.util.zze;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdb implements zzbkf {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                zzbb.zzb();
                i = zzf.zzC(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                int i2 = zze.zza;
                zzo.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (zze.zzc()) {
            zze.zza("Parse pixels for " + str + ", got string " + str2 + ", int " + i + ".");
        }
        return i;
    }

    private static void zzc(zzcbp zzcbp, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbp.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                String format = String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", new Object[]{str, str2});
                int i = zze.zza;
                zzo.zzj(format);
                return;
            }
        }
        if (str2 != null) {
            zzcbp.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbp.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbp.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbp.zzD(Integer.parseInt(str5));
        }
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int i;
        int i2;
        Map map2 = map;
        zzccb zzccb = (zzccb) obj;
        String str = (String) map2.get("action");
        if (str == null) {
            int i3 = zze.zza;
            zzo.zzj("Action missing from video GMSG.");
            return;
        }
        Integer num = null;
        Integer valueOf = map2.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map2.get("playerId"))) : null;
        Integer zzb = zzccb.zzn() != null ? zzccb.zzn().zzb() : null;
        if (valueOf == null || zzb == null || valueOf.equals(zzb) || str.equals("load")) {
            if (zze.zzm(3)) {
                JSONObject jSONObject = new JSONObject(map2);
                jSONObject.remove("google.afma.Notify_dt");
                zzo.zze("Video GMSG: " + str + " " + jSONObject.toString());
            }
            if (str.equals("background")) {
                String str2 = (String) map2.get("color");
                if (TextUtils.isEmpty(str2)) {
                    zzo.zzj("Color parameter missing from background video GMSG.");
                    return;
                }
                try {
                    zzccb.setBackgroundColor(Color.parseColor(str2));
                } catch (IllegalArgumentException unused) {
                    zzo.zzj("Invalid color parameter in background video GMSG.");
                }
            } else if (str.equals("playerBackground")) {
                String str3 = (String) map2.get("color");
                if (TextUtils.isEmpty(str3)) {
                    zzo.zzj("Color parameter missing from playerBackground video GMSG.");
                    return;
                }
                try {
                    zzccb.zzB(Color.parseColor(str3));
                } catch (IllegalArgumentException unused2) {
                    zzo.zzj("Invalid color parameter in playerBackground video GMSG.");
                }
            } else {
                int i4 = 0;
                if (str.equals("decoderProps")) {
                    String str4 = (String) map2.get("mimeTypes");
                    if (str4 == null) {
                        zzo.zzj("No MIME types specified for decoder properties inspection.");
                        HashMap hashMap = new HashMap();
                        hashMap.put("event", "decoderProps");
                        hashMap.put("error", "missingMimeTypes");
                        zzccb.zzd("onVideoEvent", hashMap);
                        return;
                    }
                    HashMap hashMap2 = new HashMap();
                    String[] split = str4.split(",");
                    int length = split.length;
                    while (i4 < length) {
                        String str5 = split[i4];
                        hashMap2.put(str5, zzcj.zza(str5.trim()));
                        i4++;
                    }
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("event", "decoderProps");
                    hashMap3.put("mimeTypes", hashMap2);
                    zzccb.zzd("onVideoEvent", hashMap3);
                    return;
                }
                zzcbq zzn = zzccb.zzn();
                if (zzn == null) {
                    zzo.zzj("Could not get underlay container for a video GMSG.");
                    return;
                }
                boolean equals = str.equals("new");
                boolean equals2 = str.equals("position");
                if (equals || equals2) {
                    Context context = zzccb.getContext();
                    int zzb2 = zzb(context, map2, "x", 0);
                    int zzb3 = zzb(context, map2, "y", 0);
                    int zzb4 = zzb(context, map2, "w", -1);
                    zzbcv zzbcv = zzbde.zzeg;
                    if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                        i = zzb4 == -1 ? zzccb.zzh() : Math.min(zzb4, zzccb.zzh());
                    } else {
                        if (zze.zzc()) {
                            zze.zza("Calculate width with original width " + zzb4 + ", videoHost.getVideoBoundingWidth() " + zzccb.zzh() + ", x " + zzb2 + ".");
                        }
                        i = Math.min(zzb4, zzccb.zzh() - zzb2);
                    }
                    int i5 = i;
                    int zzb5 = zzb(context, map2, "h", -1);
                    if (((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue()) {
                        i2 = zzb5 == -1 ? zzccb.zzg() : Math.min(zzb5, zzccb.zzg());
                    } else {
                        if (zze.zzc()) {
                            zze.zza("Calculate height with original height " + zzb5 + ", videoHost.getVideoBoundingHeight() " + zzccb.zzg() + ", y " + zzb3 + ".");
                        }
                        i2 = Math.min(zzb5, zzccb.zzg() - zzb3);
                    }
                    int i6 = i2;
                    try {
                        i4 = Integer.parseInt((String) map2.get("player"));
                    } catch (NumberFormatException unused3) {
                    }
                    int i7 = i4;
                    boolean parseBoolean = Boolean.parseBoolean((String) map2.get("spherical"));
                    if (!equals || zzn.zza() != null) {
                        zzn.zzc(zzb2, zzb3, i5, i6);
                        return;
                    }
                    zzn.zzd(zzb2, zzb3, i5, i6, i7, parseBoolean, new zzcca((String) map2.get("flags")));
                    zzcbp zza2 = zzn.zza();
                    if (zza2 != null) {
                        zzc(zza2, map2);
                        return;
                    }
                    return;
                }
                zzcgi zzq = zzccb.zzq();
                if (zzq != null) {
                    if (str.equals("timeupdate")) {
                        String str6 = (String) map2.get("currentTime");
                        if (str6 == null) {
                            zzo.zzj("currentTime parameter missing from timeupdate video GMSG.");
                            return;
                        }
                        try {
                            zzq.zzt(Float.parseFloat(str6));
                            return;
                        } catch (NumberFormatException unused4) {
                            zzo.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                            return;
                        }
                    } else if (str.equals("skip")) {
                        zzq.zzu();
                        return;
                    }
                }
                zzcbp zza3 = zzn.zza();
                if (zza3 == null) {
                    HashMap hashMap4 = new HashMap();
                    hashMap4.put("event", "no_video_view");
                    zzccb.zzd("onVideoEvent", hashMap4);
                } else if (str.equals("click")) {
                    Context context2 = zzccb.getContext();
                    int zzb6 = zzb(context2, map2, "x", 0);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, (float) zzb6, (float) zzb(context2, map2, "y", 0), 0);
                    zza3.zzx(obtain);
                    obtain.recycle();
                } else if (str.equals("currentTime")) {
                    String str7 = (String) map2.get("time");
                    if (str7 == null) {
                        zzo.zzj("Time parameter missing from currentTime video GMSG.");
                        return;
                    }
                    try {
                        zza3.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                    } catch (NumberFormatException unused5) {
                        zzo.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                    }
                } else if (str.equals("hide")) {
                    zza3.setVisibility(4);
                } else if (str.equals("remove")) {
                    zza3.setVisibility(8);
                } else if (str.equals("load")) {
                    zza3.zzr(valueOf);
                } else if (str.equals("loadControl")) {
                    zzc(zza3, map2);
                } else if (str.equals("muted")) {
                    if (Boolean.parseBoolean((String) map2.get("muted"))) {
                        zza3.zzs();
                    } else {
                        zza3.zzI();
                    }
                } else if (str.equals("pause")) {
                    zza3.zzu();
                } else if (str.equals("play")) {
                    zza3.zzv();
                } else if (str.equals("show")) {
                    zza3.setVisibility(0);
                } else if (str.equals("src")) {
                    String str8 = (String) map2.get("src");
                    if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcn)).booleanValue() || !TextUtils.isEmpty(str8)) {
                        if (map2.containsKey("periodicReportIntervalMs")) {
                            try {
                                num = Integer.valueOf(Integer.parseInt((String) map2.get("periodicReportIntervalMs")));
                            } catch (NumberFormatException unused6) {
                                zzo.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map2.get("periodicReportIntervalMs"))));
                            }
                        }
                        String[] strArr = {str8};
                        String str9 = (String) map2.get("demuxed");
                        if (str9 != null) {
                            try {
                                JSONArray jSONArray = new JSONArray(str9);
                                ArrayList arrayList = new ArrayList();
                                for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                                    String string = jSONArray.getString(i8);
                                    if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcn)).booleanValue() || !TextUtils.isEmpty(string)) {
                                        arrayList.add(string);
                                    }
                                }
                                if (!((Boolean) zzbd.zzc().zzb(zzbde.zzcn)).booleanValue() || !arrayList.isEmpty()) {
                                    strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                } else {
                                    zzo.zzj("All demuxed URLs are empty for playback: " + str9);
                                    return;
                                }
                            } catch (JSONException unused7) {
                                zzo.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                                strArr = new String[]{str8};
                            }
                        }
                        if (num != null) {
                            zzccb.zzA(num.intValue());
                        }
                        zza3.zzE(str8, strArr);
                        return;
                    }
                    zzo.zzj("Src parameter missing from src video GMSG.");
                } else if (str.equals("touchMove")) {
                    Context context3 = zzccb.getContext();
                    zza3.zzH((float) zzb(context3, map2, "dx", 0), (float) zzb(context3, map2, "dy", 0));
                    if (!this.zza) {
                        zzccb.zzdi();
                        this.zza = true;
                    }
                } else if (str.equals("volume")) {
                    String str10 = (String) map2.get("volume");
                    if (str10 == null) {
                        zzo.zzj("Level parameter missing from volume video GMSG.");
                        return;
                    }
                    try {
                        zza3.zzG(Float.parseFloat(str10));
                    } catch (NumberFormatException unused8) {
                        zzo.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
                    }
                } else if (str.equals("watermark")) {
                    zza3.zzp();
                } else {
                    zzo.zzj("Unknown video action: ".concat(str));
                }
            }
        } else {
            String format = String.format(Locale.US, "Event intended for player %s, but sent to player %d - event ignored", new Object[]{valueOf, zzb});
            int i9 = zze.zza;
            zzo.zzi(format);
        }
    }
}
