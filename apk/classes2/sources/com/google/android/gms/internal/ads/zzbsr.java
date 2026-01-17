package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.net.HttpHeaders;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzbsr extends zzbsu {
    private final Map zza;
    /* access modifiers changed from: private */
    public final Context zzb;

    public zzbsr(zzcfg zzcfg, Map map) {
        super(zzcfg, "storePicture");
        this.zza = map;
        this.zzb = zzcfg.zzi();
    }

    public final void zzb() {
        String str;
        String str2;
        String str3;
        String str4;
        Context context = this.zzb;
        if (context == null) {
            zzh("Activity context is not available");
            return;
        }
        zzv.zzr();
        if (!new zzbcm(context).zzc()) {
            zzh("Feature is not supported by the device.");
            return;
        }
        String str5 = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str5)) {
            zzh("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str5)) {
            String lastPathSegment = Uri.parse(str5).getLastPathSegment();
            zzv.zzr();
            if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                Resources zze = zzv.zzp().zze();
                zzv.zzr();
                AlertDialog.Builder zzL = zzs.zzL(context);
                if (zze != null) {
                    str = zze.getString(R.string.s1);
                } else {
                    str = "Save image";
                }
                zzL.setTitle(str);
                if (zze != null) {
                    str2 = zze.getString(R.string.s2);
                } else {
                    str2 = "Allow Ad to store image in Picture gallery?";
                }
                zzL.setMessage(str2);
                if (zze != null) {
                    str3 = zze.getString(R.string.s3);
                } else {
                    str3 = HttpHeaders.ACCEPT;
                }
                zzL.setPositiveButton(str3, new zzbsp(this, str5, lastPathSegment));
                if (zze != null) {
                    str4 = zze.getString(R.string.s4);
                } else {
                    str4 = "Decline";
                }
                zzL.setNegativeButton(str4, new zzbsq(this));
                zzL.create().show();
                return;
            }
            zzh("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
        } else {
            zzh("Invalid image url: ".concat(String.valueOf(str5)));
        }
    }
}
