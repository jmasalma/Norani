package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcdc implements zzbkf {
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzccb zzccb = (zzccb) obj;
        zzcgi zzq = zzccb.zzq();
        if (zzq == null) {
            try {
                zzcgi zzcgi = new zzcgi(zzccb, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzccb.zzC(zzcgi);
                zzq = zzcgi;
            } catch (NullPointerException e) {
                e = e;
                int i = zze.zza;
                zzo.zzh("Unable to parse videoMeta message.", e);
                zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                int i2 = zze.zza;
                zzo.zzh("Unable to parse videoMeta message.", e);
                zzv.zzp().zzw(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zze.zzm(3)) {
            zzo.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzr(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
