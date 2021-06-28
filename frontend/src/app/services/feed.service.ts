import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';
import { UserVm } from '../models/UserVm';

@Injectable({
    providedIn: 'root'
})
export class FeedService {

    constructor(
        private http: HttpClient
    ) { }

    getFeed(page: number) {
        return this.http.get<UserVm>(`${environment.api_url}/feed/${page}`)
    }

}
