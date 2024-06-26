/*
 * Copyright By @2dgirlismywaifu (2023) .
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.notelysia.restservices.model.entity.newsapp;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sync_news_favourite")
public class SyncNewsFavourite implements Serializable {
  // Instance variables
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "favourite_id")
  private int favouriteId;

  @Column(name = "user_id")
  private int userId;

  @Column(name = "url")
  private String url;

  @Column(name = "title")
  private String title;

  @Column(name = "image_url")
  private String imageUrl;

  @Column(name = "pubdate")
  private String pubDate;

  @Column(name = "is_deleted")
  private int isDeleted;
}
