package br.com.theusmm.forum.mapper

interface Mapper<T, U> {

    fun map(t: T): U
}
