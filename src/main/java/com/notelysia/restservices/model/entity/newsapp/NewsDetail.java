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

import com.notelysia.restservices.model.entity.newsapp.CompositeKey.NewsDetailPK;
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
@IdClass(NewsDetailPK.class)
@Table(name = "news_detail")
public class NewsDetail implements Serializable {
  // Instance variables
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "id")
  private int id;

  @Id
  @Column(name = "source_id")
  private int sourceId;

  @Column(name = "url_type")
  private String urlType;

  @Column(name = "url", nullable = false)
  private String url;
}
