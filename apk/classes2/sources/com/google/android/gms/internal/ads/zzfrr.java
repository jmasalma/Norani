package com.google.android.gms.internal.ads;

import android.net.Network;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
public final class zzfrr extends zzfrf {
    private zzfwh<Integer> zza;
    private zzfwh<Integer> zzb;
    private zzfrq zzc;
    private HttpURLConnection zzd;

    zzfrr() {
        this(new zzfrh(), new zzfri(), (zzfrq) null);
    }

    zzfrr(zzfwh<Integer> zzfwh, zzfwh<Integer> zzfwh2, zzfrq zzfrq) {
        this.zza = zzfwh;
        this.zzb = zzfwh2;
        this.zzc = zzfrq;
    }

    static /* synthetic */ Integer zzf() {
        return -1;
    }

    static /* synthetic */ Integer zzg() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        zzfrg.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public void close() {
        zzs(this.zzd);
    }

    public HttpURLConnection zzm() throws IOException {
        zzfrg.zzb(((Integer) this.zza.zza()).intValue(), ((Integer) this.zzb.zza()).intValue());
        zzfrq zzfrq = this.zzc;
        zzfrq.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) zzfrq.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(zzfrq zzfrq, int i, int i2) throws IOException {
        this.zza = new zzfrj(i);
        this.zzb = new zzfrk(i2);
        this.zzc = zzfrq;
        return zzm();
    }

    public HttpURLConnection zzo(Network network, URL url, int i, int i2) throws IOException {
        this.zza = new zzfrl(i);
        this.zzb = new zzfrm(i2);
        this.zzc = new zzfrn(network, url);
        return zzm();
    }

    public URLConnection zzr(URL url, int i) throws IOException {
        this.zza = new zzfro(i);
        this.zzc = new zzfrp(url);
        return zzm();
    }
}
