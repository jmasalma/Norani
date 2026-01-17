package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfln {
    private final zzfly zza;
    private final WebView zzb;
    private final List zzc = new ArrayList();
    private final Map zzd = new HashMap();
    private final String zze;
    private final String zzf;
    private final zzflo zzg;

    private zzfln(zzfly zzfly, WebView webView, String str, List list, String str2, String str3, zzflo zzflo) {
        this.zza = zzfly;
        this.zzb = webView;
        this.zzg = zzflo;
        this.zzf = str2;
        this.zze = str3;
    }

    public static zzfln zzb(zzfly zzfly, WebView webView, String str, String str2) {
        if (str2 != null) {
            zzfni.zzd(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new zzfln(zzfly, webView, (String) null, (List) null, str, str2, zzflo.HTML);
    }

    public static zzfln zzc(zzfly zzfly, WebView webView, String str, String str2) {
        zzfni.zzd("", 256, "CustomReferenceData is greater than 256 characters");
        return new zzfln(zzfly, webView, (String) null, (List) null, str, "", zzflo.JAVASCRIPT);
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzflo zzd() {
        return this.zzg;
    }

    public final zzfly zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}
