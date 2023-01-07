package com.parishod.chatGenieX.network;

import com.parishod.chatGenieX.model.GithubReleaseNotes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetReleaseNotesService {
    @GET("/repos/Script-Kiddie-JKB/chatGenieX/releases")
    Call<List<GithubReleaseNotes>> getReleaseNotes();
}
