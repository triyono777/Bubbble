package com.imangazalievm.bubbble.domain.global.repositories;


import com.imangazalievm.bubbble.domain.global.models.Comment;
import com.imangazalievm.bubbble.domain.global.models.ShotCommentsRequestParams;

import java.util.List;

import io.reactivex.Single;

public interface CommentsRepository {

    Single<List<Comment>> getComments(ShotCommentsRequestParams requestParams);

}
