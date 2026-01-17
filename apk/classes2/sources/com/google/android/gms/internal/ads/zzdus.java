package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdus {
    private final Context zza;
    private final ApplicationInfo zzb;
    private final int zzc;
    private final int zzd;
    private String zze = "";

    public zzdus(Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
        this.zzc = ((Integer) zzbd.zzc().zzb(zzbde.zzjC)).intValue();
        this.zzd = ((Integer) zzbd.zzc().zzb(zzbde.zzjD)).intValue();
    }

    public final JSONObject zza() throws JSONException {
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        try {
            Context context = this.zza;
            String str3 = this.zzb.packageName;
            zzfrw zzfrw = zzs.zza;
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, Wrappers.packageManager(context).getApplicationLabel(str3));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        zzv.zzr();
        Drawable drawable = null;
        try {
            str = zzs.zzq(this.zza);
        } catch (RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.zze.isEmpty()) {
            try {
                drawable = (Drawable) Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).second;
            } catch (PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                str2 = "";
            } else {
                int i = this.zzc;
                int i2 = this.zzd;
                drawable.setBounds(0, 0, i, i2);
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                str2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = str2;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
