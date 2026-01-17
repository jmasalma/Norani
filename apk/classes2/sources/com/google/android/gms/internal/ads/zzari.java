package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzari extends zzaqd {
    private final Object zza = new Object();
    private final zzaqi zzb;

    public zzari(int i, String str, zzaqi zzaqi, zzaqh zzaqh) {
        super(i, str, zzaqh);
        this.zzb = zzaqi;
    }

    /* access modifiers changed from: protected */
    public final zzaqj zzh(zzapz zzapz) {
        String str;
        try {
            byte[] bArr = zzapz.zzb;
            Map map = zzapz.zzc;
            String str2 = "ISO-8859-1";
            if (map != null) {
                String str3 = (String) map.get(HttpHeaders.CONTENT_TYPE);
                if (str3 != null) {
                    String[] split = str3.split(";", 0);
                    int i = 1;
                    while (true) {
                        if (i >= split.length) {
                            break;
                        }
                        String[] split2 = split[i].trim().split("=", 0);
                        if (split2.length == 2 && split2[0].equals("charset")) {
                            str2 = split2[1];
                            break;
                        }
                        i++;
                    }
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapz.zzb);
        }
        return zzaqj.zzb(str, zzara.zzb(zzapz));
    }

    /* access modifiers changed from: protected */
    /* renamed from: zzz */
    public void zzo(String str) {
        zzaqi zzaqi;
        synchronized (this.zza) {
            zzaqi = this.zzb;
        }
        zzaqi.zza(str);
    }
}
