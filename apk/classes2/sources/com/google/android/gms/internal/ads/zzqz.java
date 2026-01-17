package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzqz {
    public static void zza(AudioTrack audioTrack, zzpp zzpp) {
        audioTrack.setPreferredDevice(zzpp == null ? null : zzpp.zza);
    }
}
