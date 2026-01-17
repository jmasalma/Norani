package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzark {
    public static zzaqg zza(Context context, zzaqr zzaqr) {
        zzaqs zzaqs;
        if (zzaqr == null) {
            zzaqs = new zzaqs(new zzare((zzard) null, (SSLSocketFactory) null));
        } else {
            zzaqs = new zzaqs(zzaqr);
        }
        zzaqg zzaqg = new zzaqg(new zzaqz((zzaqy) new zzarj(context.getApplicationContext()), 5242880), zzaqs, 4);
        zzaqg.zzd();
        return zzaqg;
    }
}
