import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowOrderComponent } from './show-order.component';

describe('ShowOrderComponent', () => {
  let component: ShowOrderComponent;
  let fixture: ComponentFixture<ShowOrderComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowOrderComponent]
    });
    fixture = TestBed.createComponent(ShowOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
