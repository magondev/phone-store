import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';

import { HeroComponent } from '../../components/hero/hero.component';
import { CommonModule } from '@angular/common';
import { Device } from '../../interfaces/device';

interface DeviceResponse {
  SAMSUNG: Device[];
  HUAWEI: Device[];
  APPLE: Device[];
}

@Component({
  selector: 'app-landing-page',
  standalone: true,
  imports: [HeroComponent, HttpClientModule, CommonModule],
  templateUrl: './landing-page.component.html',
  styleUrl: './landing-page.component.scss'
})
export class LandingPageComponent {
  appleDevices: Device[] = [];
  samsungDevices: Device[] = [];
  huaweiDevices: Device[] = [];

  fetchAppleDevices() {
    const endpointUrl = 'http://localhost:8080/api/v1/phones/newest-phones-per-brand';

    this.http.get<DeviceResponse>(endpointUrl).subscribe((response: DeviceResponse) => {
      if (response.APPLE) {
        this.appleDevices = response.APPLE.map((device: Device) => device);
      }

      if (response.SAMSUNG) {
        this.samsungDevices = response.SAMSUNG.map((device: Device) => device);
      }

      if (response.HUAWEI) {
        this.huaweiDevices = response.HUAWEI.map((device: Device) => device);
      }
    });
  }

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.fetchAppleDevices();
  }
}
