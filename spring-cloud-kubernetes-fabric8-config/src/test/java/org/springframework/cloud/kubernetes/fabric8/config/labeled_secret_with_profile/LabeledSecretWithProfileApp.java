/*
 * Copyright 2013-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile.properties.Blue;
import org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile.properties.Green;
import org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile.properties.GreenPurple;
import org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile.properties.GreenPurpleK8s;
import org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile.properties.GreenSecretK8s;
import org.springframework.cloud.kubernetes.fabric8.config.labeled_secret_with_profile.properties.GreenSecretProd;

@SpringBootApplication
@EnableConfigurationProperties({ Blue.class, Green.class, GreenSecretK8s.class, GreenSecretProd.class,
		GreenPurple.class, GreenPurpleK8s.class })
public class LabeledSecretWithProfileApp {

	public static void main(String[] args) {
		SpringApplication.run(LabeledSecretWithProfileApp.class, args);
	}

}
