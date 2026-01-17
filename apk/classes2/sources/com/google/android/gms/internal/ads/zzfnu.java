package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public abstract class zzfnu extends AsyncTask {
    private zzfnv zza;
    protected final zzfnm zzd;

    public zzfnu(zzfnm zzfnm) {
        this.zzd = zzfnm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfnv zzfnv = this.zza;
        if (zzfnv != null) {
            zzfnv.zza(this);
        }
    }

    public final void zzb(zzfnv zzfnv) {
        this.zza = zzfnv;
    }
}
