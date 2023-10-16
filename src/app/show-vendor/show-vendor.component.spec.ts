import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowVendorComponent } from './show-vendor.component';

describe('ShowVendorComponent', () => {
  let component: ShowVendorComponent;
  let fixture: ComponentFixture<ShowVendorComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowVendorComponent]
    });
    fixture = TestBed.createComponent(ShowVendorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
