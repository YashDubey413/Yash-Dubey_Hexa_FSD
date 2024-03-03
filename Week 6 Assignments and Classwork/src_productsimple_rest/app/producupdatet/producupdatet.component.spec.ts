import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProducupdatetComponent } from './producupdatet.component';

describe('ProducupdatetComponent', () => {
  let component: ProducupdatetComponent;
  let fixture: ComponentFixture<ProducupdatetComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ProducupdatetComponent]
    });
    fixture = TestBed.createComponent(ProducupdatetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
