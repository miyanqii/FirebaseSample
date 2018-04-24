package jp.miyanqii.firebasesample.model.entity

import io.reactivex.Completable
import io.reactivex.Flowable

interface ContentRepository{

    fun getContents():Flowable<List<Content>>

    fun refresh():Completable

    fun restore():Completable

    fun next():Completable

    fun clear():Completable

}