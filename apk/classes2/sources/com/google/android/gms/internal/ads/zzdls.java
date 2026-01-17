package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdls implements zzfve {
    public final /* synthetic */ String zza;
    public final /* synthetic */ double zzb;
    public final /* synthetic */ int zzc;
    public final /* synthetic */ int zzd;

    public /* synthetic */ zzdls(String str, double d, int i, int i2) {
        this.zza = str;
        this.zzb = d;
        this.zzc = i;
        this.zzd = i2;
    }

    public final Object apply(Object obj) {
        return new zzbgc(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(this.zza), this.zzb, this.zzc, this.zzd, (Map) null);
    }
}
